package dto;

public class Product{
	private String name;
	private int qty;
	private double price;

	public Product(String n,int q,double p){
		name = n;
		qty = q;
		price = p;
	}

	public String getName(){
		return name;
	}

	public int getQty(){
		return qty;
	}

	public double getPrice(){
		return price;
	}

	public double getTotal(){
		return price*qty;
	}
}