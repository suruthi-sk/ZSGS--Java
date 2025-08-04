 /*
 Use switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
*/

import java.util.Scanner;

public class GradeUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percent = sc.nextInt();

        switch (percent / 10) { 
            case 10: 
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
