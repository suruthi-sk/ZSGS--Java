/*
3. Write a program to illustrate how to throw a ClassNotFoundException.
*/

public class Problem3 extends Exception {
	public static void main(String[] args) {
		try{
			Class.forName("Problem21");
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found: " + e.getMessage());
		}
	}
}

