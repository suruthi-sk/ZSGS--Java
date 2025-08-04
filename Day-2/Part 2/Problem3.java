/* Write a program which generates 30 terms of Fibonacci no in an array and then prints it. */

public class Problem3{
	public static void main(String args[]){
		int[] arr = new int[30];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2;i<30;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		System.out.println("First 30 fibonacci series are : ");
		
		for(int num : arr)
			System.out.print(num + "\t");
	}
}
		
		