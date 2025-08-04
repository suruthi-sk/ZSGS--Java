/*
9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
*/

import java.io.*;

public class Problem9 extends Exception {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("Example.txt");
		} catch(FileNotFoundException e) {
			System.out.println("Catch .. : " + e.getMessage());
		} catch(IOException e) {
			System.out.println("Catch .... : " + e.getMessage());
		} finally {
			System.out.println("Finally block executing.....");
		}
	}
}