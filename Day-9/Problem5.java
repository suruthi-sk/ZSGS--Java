/*
5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.
*/

public class Problem5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(getReturnOfTry(a,b));
	}
	
	static String getReturnOfTry(int a, int b) {
		int rem = 0;
		try {
			if(a%b==0) {
				return "a is factor of b";
			} else {
				return "a is not a factor of b";
			}
		} catch(ArithmeticException e) {
			System.out.println("Catch : " + e.getMessage());
		} finally {
			System.out.println("Finally is Executing..........");
		}
		return "";
	}
}