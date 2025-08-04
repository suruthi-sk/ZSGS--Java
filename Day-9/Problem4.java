/*
4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.
*/

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String s = sc.next();
		sc.close();
		
		try {
			int num = Integer.parseInt(s);
			System.out.println("Successfully parsed using Integer.parseInt() method");
		} catch(Exception e) {
			System.out.println("Catch : " + e.getMessage());
		}
	}
}