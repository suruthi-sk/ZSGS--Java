/*
Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
*/

import java.util.Scanner;

public class Problem1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter the elements of Array : ");
		
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int num: arr){
			if(num%2!=0){
				sum += num;
			}
		}
		
		System.out.println("Sum of odd numbers in the given array is " + sum);
	}
}