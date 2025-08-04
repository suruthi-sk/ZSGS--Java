// explicit type casting

import java.util.Scanner;

public class ExplicitTypeCast{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		long a = sc.nextLong();
		
		int b = (int)a;
		byte c = (byte)b;
		
		System.out.println(b);
		System.out.println(c);
	}
}	
		
		