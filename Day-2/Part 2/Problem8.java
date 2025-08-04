/*
Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
*/

import java.util.Scanner;

public class Problem8{
	public static void main(String[] args){
		int[] ages = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Ages : ");
		for(int i=0;i<10;i++){
			ages[i] = sc.nextInt();
		}
		
		ageCount(ages);
	}
	
	static void ageCount(int[] arr){
		int below18 = 0;
		int age1860 = 0;
		int above60 = 0;
		
		for(int num: arr){
			if(num<18) below18++;
			else if(num>=18 && num<=60) age1860++;
			else above60++;
		}
		
		System.out.println("Ages below 18 = " + below18);
		System.out.println("Ages between 18 to 60 = " + age1860);
		System.out.println("Ages above 60 = " + above60);
	}
}