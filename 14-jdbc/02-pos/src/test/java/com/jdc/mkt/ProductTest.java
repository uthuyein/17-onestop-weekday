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

public class ProductTest extends JunitFactory{

	private DbOperation<Product> service = new ProductService();
	
	@Order(1)
	@ParameterizedTest
	@CsvSource({
		"5,bluebarries,3.4,Medium,"
	})
	void insertTest(int catId,String name,Double price,String size,int res) {
		var category = new Category();
		category.setId(catId);
		
		var product = new Product(name, price, Size.Medium);
		product.setCategory(category);
		
		var id = service.save(product);
		assertEquals(res, id);
	}
	
	@Order(2)
	void updateTest(String name,Integer price,String size,int res) {
		
	}
	
	@Order(3)
	void deleteTest(int id,int res) {
		
	}
	
	@Order(4)
	void selectTest(String category,
			String product,
			Integer pricefrom,
			Integer priceTo,
			String size,
			int res) {
		
	}
}
