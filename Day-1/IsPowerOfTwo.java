// Check if a number is power of 2

import java.util.Scanner;

public class IsPowerOfTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int flag = 0;
		
		for(int i=1;i<num;i++){
			int pow = (int)Math.pow(2,i);
			if(pow==num){
				flag = 1;
			}
		}
		
		if(flag == 1) System.out.println("Yes, The given number is power of 2");
		else System.out.println("Oh no, The given number is not a power of 2");
	}
}