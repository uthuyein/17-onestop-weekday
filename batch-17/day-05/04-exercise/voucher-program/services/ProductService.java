package services;
import dto.Product;
import java.util.Arrays;

public class ProductService{
	private Product[] products;

	{
		products = new Product[0];
	}

	public void addProduct(Product p){

		products = Arrays.copyOf(products,products.length + 1);
		products[products.length - 1] = p ;
		 
		// Product[] temp = new Product[products.length + 1];
		
		// for(int i = 0 ; i < products.length ; i ++){
		// 	temp[i] = products[i];
		// }
		// temp[products.length] = p;
		// products = temp ;
	}

	public Product[] getProducts(){
		return products;
	}

}