// 3. Develop a Java program which illustrates the usage of Comparable Interface.

import java.util.*;

class Product implements Comparable<Product>{
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
	
	//@Override
	public int compareTo(Product p) {
		return (int)this.price-(int)p.price;
	}
	
	public String toString() {
		return "[ Product ID : " + productId + ", Product Name : " + productName + ", Price : " + price + " ]";
	}
}

public class Problem3 {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1, "Book", 40));
		list.add(new Product(2, "Pen", 10));
		list.add(new Product(3, "Pencil", 5));
		list.add(new Product(4, "Sketch", 50));
		list.add(new Product(1, "Water Paint", 60));
		
		Collections.sort(list);
		
		for(Product product: list){
			System.out.println(product);
		}
	}
}