/*
Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
*/

import java.util.Scanner;

public class Problem9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[10];
        int[][] marks = new int[10][3];
        int[] total = new int[10];
        double[] average = new double[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Enter roll number for student " + (i + 1) + ": ");
            rollNo[i] = sc.nextInt();

            System.out.println("Enter marks for 3 subjects: ");
            for (int j = 0; j < 3; j++){
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }

            average[i] = total[i] / 3.0; 
        }

        System.out.println("\nRoll No\tTotal Marks\tAverage");
        System.out.println("--------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t\t%.2f\n", rollNo[i], total[i], average[i]);
        }
    }
}
