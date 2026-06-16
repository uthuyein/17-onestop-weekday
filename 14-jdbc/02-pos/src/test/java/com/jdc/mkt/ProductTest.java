package com.jdc.mkt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.model.Category;
import com.jdc.mkt.model.Product;
import com.jdc.mkt.model.Product.Size;
import com.jdc.mkt.model.services.DbOperation;
import com.jdc.mkt.model.services.ProductService;

public class ProductTest extends ProductFactory {

	private DbOperation<Product> service = new ProductService();

	@Order(1)
	@ParameterizedTest
	@CsvSource({ "5,bluebarries,3.4,Medium,13" })
	void insertTest(int catId, String name, Double price, String size, int res) {
		var category = new Category();
		category.setId(catId);

		var product = new Product();
		product.setName(name);
		product.setPrice(price);
		product.setSize(null != size ? Size.valueOf(size): null);
		product.setCategory(category);
		product.setCategory(category);

		var id = service.save(product);
		assertEquals(res, id);
	}

	@Order(2)
	@ParameterizedTest
	@CsvSource({ "5,13,bluebarry,3.5,Large,1" })
	void updateTest(Integer catId, Integer prodId,String name, Double price, String size, int res) {

		var category = new Category();
		category.setId(catId);

		var product = new Product(
				prodId,
				name,
				price, 
				Size.valueOf(size),
				category);
		
		var row = service.update(product);
		assertEquals(res, row);
	}

	@Order(3)
	void deleteTest(int id, int res) {

	}

	@Order(4)
	@ParameterizedTest
	@CsvSource({ 
		"Berries,,,2",
		",s,,2",
		"Root Vegetables,c,,1",
		",,Small,3"
	})
	void searchTest(String cName, String pName, String size, int res) {
		var category = new Category();
		category.setName(cName);
	
		var product = new Product( );
		product.setName(pName);
		product.setSize(null != size ? Size.valueOf(size): null);
		product.setCategory(category);
		
		var list = service.searchBy(product);
		assertEquals(res, list.size());
	}
}
