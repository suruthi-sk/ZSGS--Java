/*
2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
*/

import com.arithmetic.Arithmetic;
import com.stringutils.StringUtils;
import java.util.Scanner;

public class Problem2{
	public static void main(String[] args){
		Arithmetic arith = new Arithmetic();
		StringUtils str = new StringUtils();
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String s1 = "";
		
		System.out.print("Enter choice \n1. Arithmetic \n2. Strings ");
		int opt = sc.nextInt();
		
		if(opt == 1){
			System.out.print("Enter two numbers : ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.print("Enter choice : \n1.Addition \n2.Subtract \n3.Multiple \n4.Divide \n5.Modulus");
			System.out.println();
			int ch = sc.nextInt();
			
			switch(ch){
				case 1:
					int result1 = arith.add(a,b);
					System.out.println("Sum : " + result1);
					break;
					
				case 2:
					int result2 = arith.sub(a,b);
					System.out.println("Difference : " + result2);
					break;
					
				case 3:
					int result3 = arith.multiple(a,b);
					System.out.println("Product : " + result3);
					break;
					
				case 4:
					if(b==0){
						System.out.println("Arithmetic Exception : Divided by 0");
					}
					else{
						int result4 = arith.divide(a,b);
						System.out.println("Quotient : " + result4);
					}
					break;
					
				case 5:
					if(b==0){
						System.out.println("Arithmetic Exception : Divided by 0");
					}
					else{
						int result5 = arith.modulo(a,b);
						System.out.println("Reminder : " + result5);
					}
					break;
			}
		}

		else if(opt == 2){
			System.out.println("Enter String : ");
			s1 = sc.next();
			
			System.out.print("Enter choice : \n1.Concate \n2.Reverse \n3.Length ");
			int ch = sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.print("Enter String to concat : ");
					String s2 = sc.next();
					System.out.println("Concatenated String : " + str.concatStr(s1, s2));
					break;
					
				case 2:
					System.out.println("Reversed String : " + str.reverseStr(s1));
					break;
					
				case 3:
					System.out.println("Length of the given string : " + str.lengthOfStr(s1));
					break;
			}
		}
		else{
			System.out.println("Invalid input");
		}
	}
}
		