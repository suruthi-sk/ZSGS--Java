// Maximum of Finding new numbers
import java.util.Scanner;

public class MaxUsingTernary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		int c = a>b?a:b;
		
		System.out.println("Greater number is : " + c);
	}
}