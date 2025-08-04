/*
10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.
*/

import java.util.Scanner;

class AgeCheckException extends Exception {
	AgeCheckException(){}
	
	AgeCheckException(String message) {
		super(message);
	}
	
	void checkAge(int age) throws Exception {
		if(age<18) {
			throw new AgeCheckException("Invalid age. Only candidate above 18 can vote..!");
		} else {
			System.out.println("Eligible for voting " );
		}
	}
}

public class Problem10 {
	public static void main(String[] args) throws Exception {
		AgeCheckException ace = new AgeCheckException();
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			ace.checkAge(age);
		} catch(AgeCheckException e) {
			System.out.println("Catch : " + e.getMessage());
		}
	}
}