/* 
Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ). 
*/

import java.util.Scanner;

public class Problem4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		print(arr, n);
	}
	
	static void print(int[] arr, int n){
		int singleSum = 0;
		int doubleSum = 0;
		
		for(int num:arr){
			if(num>=0 && num<9){
				singleSum += num;
			}
			if(num>=11 && num<=99){
				doubleSum += num;
			}
		}
		
		System.out.println("Sum of single digit elements is "+ singleSum);
		System.out.println("Sum of double digit elements is "+ doubleSum);
	}
}