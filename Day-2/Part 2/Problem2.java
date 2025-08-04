/*  Write a program to take in 10 values and print only those numbers which are prime.*/

import java.util.Scanner;

public class Problem2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter the elements of Array : ");
		
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The prime numbers are : ");
		for(int num: arr){
			if(isPrime(num)) System.out.print(num + "\t" );
		}
	}
	
	static boolean isPrime(int n ){
		if(n==2 || n==3) return true;
		else if(n%2==0) return false;
		else{
			for(int i=2;i<n;i++){
				if(n%i==0) return false;
			}
		}
		return true;
	}
}