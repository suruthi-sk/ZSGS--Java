/*
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌
*/

import java.util.*;

class Product{
	int productID;
	String name;
	float price;
	int quantity;
	
	Product(int productID, String name, float price, int quantity){
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	void displayProduct(){
		System.out.println("Product ID : " + productID);
		System.out.println("Product Name : " + name);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
		System.out.println();
	}
}

class Store{
	static String storeName;
	static String storeLocation;
	
	static void setStoreDetails(String name, String location){
		storeName = name;
		storeLocation = location;
	}
	
	static void displayStoreDetails(){
		System.out.println("Store Name : " + storeName);
		System.out.println("Store Location : " + storeLocation);
    }

	List<Product> productList = new ArrayList<>();
	
	void addProduct(Product product){
		productList.add(product);
	}
	
	void displayAllProducts(){
		if(productList.isEmpty()){
			System.out.println("No product available to show...");
			return;
		}
		for(Product p : productList){
			p.displayProduct();
			System.out.println();
		}
	}
}

public class InventoryManagementSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the store name : ");
		String name = sc.nextLine();
		System.out.println("Enter store Location : ");
		String location = sc.nextLine();
		
		Store store = new Store();
		Store.setStoreDetails(name, location);
		
		System.out.println("Enter number of products to add : ");
		int total = sc.nextInt();
		

		for(int i = 0; i < total; i++){
            System.out.println("\nEnter product details:");

            System.out.print("Product ID: ");
            int p_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String p_name = sc.nextLine();

            System.out.print("Price: ");
            float p_price = sc.nextFloat();

            System.out.print("Quantity: ");
            int p_quantity = sc.nextInt();
            sc.nextLine(); 

            Product prod = new Product(p_id, p_name, p_price, p_quantity);
            store.addProduct(prod);
        }
		
		Store.displayStoreDetails();
		store.displayAllProducts();
	}
}
			
			
			