/*
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
*/

import java.util.Scanner;

class ATMPinValidationException extends Exception {
	public ATMPinValidationException(String message) {
		super(message);
	}
}
	
class ATMPinValidation {
	void checkPin(String pin) throws ATMPinValidationException {
		if(pin.length()!=4 || pin.charAt(0) == 0  || (!allNumber(pin))) {
			throw new ATMPinValidationException("Invalid Pin... Give Correct Pin. \nIf 3 attempts fail, then your account will be locked for 24 hrs. So do carefully! ");
		} else {
			System.out.println("Proceed with transaction");
		}
	}
	
	boolean allNumber(String pin) {
		int num = 0;
		try {
			num = Integer.parseInt(pin);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
		
		

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMPinValidation valid = new ATMPinValidation();
		
		System.out.print("Enter ATM Pin : ");
		String pin = sc.next();
		
		try {
			valid.checkPin(pin);
		} catch(ATMPinValidationException e) {
			System.out.println(e.getMessage());
		}
	}
}
	
	

		