package com.jdc.mkt.model.services;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.model.Category;
import com.jdc.mkt.model.Product;
import com.jdc.mkt.model.Product.Size;

import static com.jdc.mkt.util.Connector.getConnection;

public class ProductService implements DbOperation<Product> {

	@Override
	public int save(Product p) {
		String query = "insert into product_tbl(category_id,name,price,size)values(?,?,?,?)";

		try (var con = getConnection(); var stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

			stmt.setInt(1, p.getCategory().getId());
			stmt.setString(2, p.getName());
			stmt.setDouble(3, p.getPrice());
			stmt.setString(4, p.getSize().name());

			stmt.executeUpdate();

			var rs = stmt.getGeneratedKeys();

			while (rs.next())
				return rs.getInt(1);

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int update(Product p) {
		String sql = "update product_tbl set name= ?,price = ?,size = ? where id = ?";
//		var product = searchById(p.getId());

		try (var con = getConnection(); var stmt = con.prepareStatement(sql)) {

			stmt.setString(1, p.getName());
			stmt.setDouble(2, p.getPrice());
			stmt.setString(3, p.getSize().name());
			stmt.setInt(4, p.getId());

			return stmt.executeUpdate();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Product> searchBy(Product p) {
		var sb = new StringBuilder( """
				select p.id,p.name,p.price,p.size,c.id,c.name
				from product_tbl p join catgory_tbl c on p.category_id = c.id
				where p.isDelete = 0
				""");
		
		List<Product> list = new ArrayList<Product>();
		List<Object> temp = new ArrayList<Object>();

		if (null != p.getId() && p.getId() > 0) {
			sb.append(" and p.id = ?");
			temp.add(p.getId());
		}

		if (null != p.getName()) {
			sb.append(" and lower(p.name) like lower(?)");
			temp.add(p.getName().concat("%"));
		}
		
		if(null != p.getSize()) {
			sb.append(" and p.size = ?");
			temp.add(p.getSize().name());
		}
		if(null != p.getCategory() &&  null != p.getCategory().getName()) {
			sb.append(" and c.name = ?");
			temp.add(p.getCategory().getName());
		}

		try (var con = getConnection(); 
				var stmt = con.prepareStatement(sb.toString())) {

			for(int i = 0 ;i < temp.size() ; i++) {
				stmt.setObject(i+1, temp.get(i));
			}
			
			var rs = stmt.executeQuery();

			while (rs.next()) {
				var category = new Category(rs.getInt("c.id"), rs.getString("c.name"), false);
				var product = new Product(rs.getInt("p.id"), rs.getString("p.name"), rs.getDouble("p.price"),
						Size.valueOf(rs.getString("p.size")), category);

				list.add(product);
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return list;
	}

	@Override
	public Product searchById(int id) {
		String query = """
				select p.id,p.name,p.price,p.size,c.id,c.name
				from product_tbl p join catgory_tbl c on p.category_id = c.id
				where p.isDelete = 0 and p.id = ?
				""";
		try (var con = getConnection(); var stmt = con.prepareStatement(query)) {

			stmt.setInt(1, id);
			var rs = stmt.executeQuery();

			while (rs.next()) {
				var category = new Category(rs.getInt("c.id"), rs.getString("c.name"), false);
				var product = new Product(rs.getInt("p.id"), rs.getString("p.name"), rs.getDouble("p.price"),
						Size.valueOf(rs.getString("p.size")), category);

				return product;
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return null;
	}

}
