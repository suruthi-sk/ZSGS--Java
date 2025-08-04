/*
Write a program to  accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
*/

import java.util.Scanner;

public class Problem6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int n = sc.nextInt();
		int[] record = new int[n];
		
		System.out.println("Enter the graduation Years: ");
		
		for(int i=0;i<n;i++)
			record[i] = sc.nextInt();
			
		System.out.println("Enter the year you want to search " );
		int year = sc.nextInt();
		
		if(isYearPresent(record, year)) System.out.println("Record Exists");
		else System.out.println("Record does not found");
	}
	
	static boolean isYearPresent(int[] arr, int n){
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end){
			int mid = (start+end)/2;
			if(n==arr[mid])
				return true;
			else if(n<arr[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		
		return false;
	}
}	
	