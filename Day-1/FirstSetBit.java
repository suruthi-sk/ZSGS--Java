// Program to find first set bit

import java.util.Scanner;

public class FirstSetBit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int pos = 1;
		
		while((num&1)==0){
			num>>=1;
			pos++;
		}
		System.out.println(pos);

		sc.close();
	}	
	
}