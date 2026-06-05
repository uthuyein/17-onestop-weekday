import java.util.Scanner;
import dto.Product;
import services.ProductService;

class Main{
	private static Scanner sc;
	private static ProductService service;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		service = new ProductService();

		greeting("welcome");

		addProduct();
		
		showProducts();

		greeting("bye bye");
	}

	private static void showProducts(){
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("No.\tName\tPrice\t\t\tQty\t\tTotal");
		System.out.println("-------------------------------");

		Product[] array = service.getProducts();
		double total = 0 ;

		for(int i = 0 ; i < array.length ;i ++){
			Product p = array[i];
			total += p.getTotal();
			System.out.println("%d\t%s\t%f\t\t%d\t\t%f".formatted((i+1),p.getName(),p.getPrice(),p.getQty(),p.getTotal()));
		}

		System.out.println("-------------------------------");
		System.out.println("\t\t\tTotal ::: "+total);
		System.out.println();
	}

	private static void addProduct(){
		String yes = "";
		do{
			Product p = getProduct();
			service.addProduct(p);
			System.out.println("Do you want to add product again /y ?");
			yes = sc.next();

		}while(yes.equals("y"));
	}

	private static Product getProduct(){
		System.out.println("Type Product Name !");
		String name = sc.next();

		System.out.println("Type Product Price !");
		double price = sc.nextDouble();

		System.out.println("Type Product quentity !");
		int qty = sc.nextInt();

		return new Product(name,qty,price);
	}

	private static void greeting(String message){
		System.out.println("============================================");
		System.out.println("     ========= "+message+" ===========");
		System.out.println("============================================");
		System.out.println();
	}

	
}