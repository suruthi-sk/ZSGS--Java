// Compare two numbers equal or not without using comparision operator

import java.util.Scanner;

public class EqualOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		
		if((a^b) == 0) 
			System.out.println("Given two numbers are equal");
		else 
			System.out.println("Two numbers not are equal");
	}
}