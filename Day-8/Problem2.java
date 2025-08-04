// 2. Develop a Java program which illustrates the usage of Comparator Interface.

import java.util.*;

class Product {
	int productId;
	String productName;
	double price;
	Product() {}
	
	Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
		
	double getPrice() {
		return price;
	}
	
	public String toString() {
		return "[ Product ID : " + productId + ", Product Name : " + productName + ", Price : " + price + " ]";
	}
}

public class Problem2 {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1, "Book", 40));
		list.add(new Product(2, "Pen", 10));
		list.add(new Product(3, "Pencil", 5));
		list.add(new Product(4, "Sketch", 50));
		list.add(new Product(1, "Water Paint", 60));
		
		list.sort(Comparator.comparingDouble(Product::getPrice).reversed());
		//Product maxPriceProduct = Collections.max(productList, Comparator.comparing(Product::getPrice).reversed());

		
		for(Product product: list){
			System.out.println(product);
		}
	}
}