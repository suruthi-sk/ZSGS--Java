/*
2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.
*/
//import java.io.*;
import java.util.*;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		String a = sc.next();
		String b = sc.next();
		
		returnQuotient(a,b);
		sc.close();
	}
	
	static void returnQuotient(String a, String b) {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);
			
			System.out.println("Quotient : " + (n1/n2));
		} catch(InputMismatchException e) {
			System.out.println("MisMatched Input : " + e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println("Number format Exception : " + e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			System.out.println("Finally....");
		}
	}
}
