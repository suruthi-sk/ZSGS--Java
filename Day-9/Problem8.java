/*
8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.
*/

import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AuthenticationException check = new AuthenticationException();
		
		System.out.print("Enter User Name : ");
		String userName = sc.nextLine();
		
		System.out.print("Enter Password : ");
		String password = sc.nextLine();
		
		try {
			check.authenticateParameters(userName, password);
			System.out.println("Logged in successfully!!!");
		} catch (AuthenticationException e) {
			System.out.println(e.getMessage());
		}
	}
}

class AuthenticationException extends Exception {
	String correctUserName = "John";
	String correctPassword = "%^&qwerty//";
	
	AuthenticationException() {}
	
	AuthenticationException(String message) {
		super(message);
	}
	
	void authenticateParameters(String userName, String password) throws AuthenticationException {
		if((!userName.equals(correctUserName)) || (!password.equals(correctPassword))) {
			throw new AuthenticationException("Invalid Username or Password");
		}
	}
}