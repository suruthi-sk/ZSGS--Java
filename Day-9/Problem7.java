/*
7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
*/

public class Problem7 {
	public static void main(String[] args) {
		int a = 80;
		int b = 0;
		
		method1(a,b);
	}
	
	static void method1(int a, int b) {
		try {
			System.out.println( method2(a,b));
		} catch(ArithmeticException e) {
			System.out.println("Exception caught in method 1... " + e.getMessage());
		}	
	}
	
	static int method2(int a, int b) {
		return method3(a, b);
	}
	
	static int method3(int a, int b) {
		return a/b;
	}
}