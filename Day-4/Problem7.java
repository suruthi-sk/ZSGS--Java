/*
7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.
*/

import java.util.Scanner;

class BasicCalculator{
	int add(int a, int b){
		return a+b;
	}
	
	int subtract(int a, int b){
		return a-b;
	}
	
	int multiply(int a, int b){
		return a*b;
	}
	
	int divide(int num, int deno){
		if(deno==0) return -1;
		else return num/deno;
	}
}

class AdvancedCalculator extends BasicCalculator{
	int power(int base, int exponent){
		return (int)Math.pow(base, exponent);
	}
	
	int modulus(int a, int b){
		return a%b;
	}
	
	double squareRoot(double number){
		return Math.sqrt(number);
	}
}

class ScientificCalculator extends AdvancedCalculator{
	double sin(double angle){
		return Math.sin(angle);
	}
	
	double cos(double angle){
		return Math.cos(angle);
	}
	
	double log(double value){
		return Math.log(value);
	}
	
	double exp(double value){
		return Math.exp(value);
	}
}

public class Problem7{
	public static void main(String[] args){
		ScientificCalculator calc = new ScientificCalculator();
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag){
			System.out.println("\nMENU \n1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Power \n6.Modulus \n7.Square Root \n8.Sin \n9.Cos \n10.Log \n11.Exponential \n12.Exit");
			System.out.print("Enter your Choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.print("Enter two numbers to Add : ");
					int a = sc.nextInt();
					int b = sc.nextInt();
					System.out.println("Sum : " + calc.add(a,b));
					break;
					
				case 2:
					System.out.print("Enter two numbers to Subtract : ");
					int c = sc.nextInt();
					int d = sc.nextInt();
					System.out.println("Difference : " + calc.subtract(c,d));
					break;
					
				case 3:
					System.out.print("Enter two numbers to Multiply: ");
					int e = sc.nextInt();
					int f = sc.nextInt();
					System.out.println("Product : " + calc.multiply(e,f));
					break;
					
				case 4:
					System.out.print("Enter two numbers to Divide: ");
					int nom = sc.nextInt();
					int den = sc.nextInt();
					int result = calc.divide(nom,den);
					if(result==-1) System.out.println("Exception : Dividing by zero");
					else
						System.out.println("Quotient : " + result);
					break;
					
				case 5:
					System.out.print("Enter base value and Exponent value : ");
					int base = sc.nextInt();
					int exponent = sc.nextInt();
					
					System.out.println("Power : " + calc.power(base, exponent));
					break;
					
				case 6:
					System.out.print("Enter two numbers to find Reminder : ");
					int s = sc.nextInt();
					int t = sc.nextInt();
					System.out.println("Reminder : " + calc.modulus(s,t));
					break;
					
				case 7:
					System.out.println("Enter the number to find Square Root : ");
					double number = sc.nextDouble();
					System.out.println("Square root of given number is " + calc.squareRoot(number));
					break;
					
				case 8:
					System.out.print("Enter angle : ");
					double angle1 = sc.nextDouble();
					System.out.println("Sin value : " + calc.sin(angle1));
					break;
					
				case 9:
					System.out.print("Enter angle : ");
					double angle2 = sc.nextDouble();
					System.out.println("Cos value : " + calc.cos(angle2));
					break;
					
				case 10:
					System.out.print("Enter value : ");
					double value1 = sc.nextDouble();
					System.out.println("Log value : " + calc.log(value1));
					break;
					
				case 11:
					System.out.print("Enter value : ");
					double value2 = sc.nextDouble();
					System.out.println("Exponential : " + calc.exp(value2));
					break;
					
				case 12:
					System.out.println("Exiting...........");
					flag = false;
					break;
			}
		}
	}
}
					