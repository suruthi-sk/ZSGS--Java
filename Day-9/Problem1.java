/*
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
*/

public class Problem1 {
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 4, 0, 7};
		int quotient = 0;
		
		try {
			quotient = arr[7]/arr[4];
			System.out.println("Quotient : " + quotient);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound --> " + e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println("Division by 0 error --> " + e.getMessage());
		} 
		
	}
}