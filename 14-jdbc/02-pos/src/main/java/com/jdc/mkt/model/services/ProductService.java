package com.jdc.mkt.model.services;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.jdc.mkt.model.Product;
import com.jdc.mkt.util.Connector;

public class ProductService implements DbOperation<Product> {

	@Override
	public int save(Product p) {
		String query = "insert into product_tbl(category_id,name,price,size)values(?,?,?,?)";
		
		try(var con = Connector.getConnection();
			var stmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS)){
			
			stmt.setInt(1, p.getCategory().getId());
			stmt.setString(2, p.getName());
			stmt.setDouble(3, p.getPrice());
			stmt.setString(4, p.getSize().name());
			
			stmt.executeUpdate();
			
			var rs = stmt.getGeneratedKeys();
			
			while(rs.next())
				return rs.getInt(1);
			
		}catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int update(Product t) {
		return 0;
	}

	@Override
	public List<Product> searchBy(Product t) {
		return null;
	}

}
