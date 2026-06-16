package com.jdc.mkt;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.jdc.mkt.util.Connector;

import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class JunitFactory {

	private static String catQuery = """
			INSERT INTO category_tbl (name,category_id)
			VALUES
			('Fruits',null),
			('Vegetables',null),
			-- Fruits
			('Citrus Fruits', 1),
			('Tropical Fruits', 1),
			('Berries', 1),
		
			-- Vegetables
			('Leafy Vegetables', 2),
			('Root Vegetables', 2),
			('Fruit Vegetables', 2);	
			""";
	
	private static String prodQuery = """
			INSERT INTO product_tbl (category_id, name, price, size)
			VALUES
			-- Citrus Fruits (id=3)
			(3, 'Orange', 2.50, 'Medium'),
			(3, 'Lemon', 1.50, 'Small'),
		
			-- Tropical Fruits (id=4)
			(4, 'Mango', 3.50, 'Large'),
			(4, 'Banana', 1.20, 'Medium'),
			(4, 'Papaya', 2.80, 'Large'),
		
			-- Berries (id=5)
			(5, 'Strawberry', 4.50, 'Small'),
		
			-- Leafy Vegetables (id=6)
			(6, 'Spinach', 1.80, 'Medium'),
			(6, 'Mustard Greens', 2.20, 'Large'),
		
			-- Root Vegetables (id=7)
			(7, 'Carrot', 1.50, 'Small'),
			(7, 'Potato', 1.70, 'Medium'),
		
			-- Fruit Vegetables (id=8)
			(8, 'Tomato', 2.20, 'Medium'),
			(8, 'Cucumber', 1.80, 'Medium');
			""";
	
	@BeforeAll
	static void init() {
		executeProduct();
	}
	
	private static void executeProduct() {
		String truncateProduct = "truncate table product_tbl";
		String truncateCategory = "truncate table category_tbl";
		
		try(var con = Connector.getConnection();
			var stmt = con.createStatement()){
			
			stmt.addBatch(truncateProduct);
			stmt.addBatch(truncateCategory);
			stmt.addBatch(catQuery);
			stmt.addBatch(prodQuery);
			
			stmt.executeBatch();
			
		}catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
