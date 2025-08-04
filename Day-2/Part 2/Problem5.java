/*
Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
*/

import java.util.Scanner;

public class Problem5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array : ");
		int a = sc.nextInt();
		System.out.println("Enter the size of 2nd array : ");
		int b = sc.nextInt();
		
		char[] X = new char[a];
		char[] Y = new char[b];
		
		System.out.println("Enter the elements of Array 1");
		for(int i=0;i<a;i++)
			X[i] = sc.next().charAt(0);
			
		System.out.println("Enter the elements of Array 2");
		for(int i=0;i<b;i++)
			Y[i] = sc.next().charAt(0);
			
		if(isIdentical(X, Y)) System.out.println("Two char arrays are identical");
		else System.out.println("Two char arrays are not identical");
	}
	
	static boolean isIdentical(char[] X, char[] Y){
		if(X.length!= Y.length) return false;
		for(int i=0;i<X.length;i++){
			if(X[i]!=Y[i]) return false;
		}
		return true;
	}
}
			