//7. Develop a Java program to illustrate the usage of toString() method.

import java.util.*;

class Book {
	String bookName;
	String author;
	int totalVolumes;
	double price;
	
	Book(String bookName, String author, int totalVolumes, double price) {
		this.bookName = bookName;
		this.author = author;
		this.totalVolumes = totalVolumes;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\n[ Book Name : " + bookName + ", Author : " + author + ", Total volumes Released : " + totalVolumes + ", Price :" + price + " ]";
	}
}

public class Problem7 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("Harry Potter" , "J.K. Rowling", 7, 2849));
		bookList.add(new Book("The Chronicles of Narnia" , "C.S. Lewis", 7, 3560));
		bookList.add(new Book("Berserk" , "Kentaro Miura", 40, 12599));
		bookList.add(new Book("Good vibes good life" , "Vex king", 1, 599));
		
		for (Book book : bookList) {
			System.out.println(book);
		}
	}
}
		