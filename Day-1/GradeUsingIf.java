/*
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
*/

import java.util.Scanner;

public class GradeUsingIf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage: ");
		int percent = sc.nextInt();
		
		if(percent>100){
			System.out.println("Enter valid percentage  between 0 to 100");
		}else if(percent>=85 && percent<=100){
			System.out.println(" Grade A ");
		}else if(percent>=70){
			System.out.println("Grade B");
		}else if(percent >= 50){
			System.out.println("Grade C");
		}else{
			System.out.println("Fail");
		}
	}

}		