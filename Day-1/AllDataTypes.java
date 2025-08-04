// Program to get and print all datatype

import java.util.Scanner;

public class AllDataTypes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Byte");
		byte a = sc.nextByte();
		System.out.println("Enter Short");
		short b = sc.nextShort();
		System.out.println("Enter Integer");
		int c = sc.nextInt();
		System.out.println("Enter Long");
		long d = sc.nextLong();
		System.out.println("Enter float");
		float e = sc.nextFloat();
		System.out.println("Enter double");
		double f = sc.nextDouble();
		System.out.println("Enter character");
		char g = sc.next().charAt(0);
		System.out.println("Enter boolean");
		boolean h = sc.nextBoolean();
		
		System.out.println("Byte : " + a);
		System.out.println("Short : " + b);
		System.out.println("Integer : " + c);
		System.out.println("Long : " + d);
		System.out.println("Float : " + e);
		System.out.println("Double : " + f);
		System.out.println("Character : " + g);
		System.out.println("Boolean : " + h);
	}
}	