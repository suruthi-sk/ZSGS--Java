// sum of even imtegers upto n

import java.util.Scanner;

public class EvenSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int result = findSum(n);
		System.out.println(result);
	}
	
	static int findSum(int n){
		int sum = 0;
		for(int i = 1;i<=n;i++){
			if(i%2==0) sum += i;
			else continue;
		}
		return sum;
	}
}