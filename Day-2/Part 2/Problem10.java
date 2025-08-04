/*
 Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m
*/

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = null;
        boolean flag = true;

        while(flag) {
            System.out.println("\nEnter your Choice: \n1. Get Input \n2. Display \n3. Sum of matrix \n4. Row-wise sum \n5. Column-wise sum \n6. Transpose of matrix \n7. Exit");
            int input = sc.nextInt();

            switch(input) {
                case 1:
                    matrix = getInput();
                    break;
                case 2:
                    if(matrix != null) display(matrix);
                    else System.out.println("Matrix not entered yet!");
                    break;
                case 3:
                    if(matrix != null) getMatrixSum(matrix);
                    else System.out.println("Matrix not entered yet!");
                    break;
                case 4:
                    if(matrix != null) getRowSum(matrix);
                    else System.out.println("Matrix not entered yet!");
                    break;
                case 5:
                    if(matrix != null) getColumnSum(matrix);
                    else System.out.println("Matrix not entered yet!");
                    break;
                case 6:
                    if(matrix != null) getTranspose(matrix);
                    else System.out.println("Matrix not entered yet!");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static int[][] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int m = sc.nextInt();
        System.out.println("Enter the column size: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void display(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void getMatrixSum(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of Matrix = " + sum);
    }

    static void getRowSum(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=0;j<arr[i].length;j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i+1) + " = " + sum);
        }
    }

    static void getColumnSum(int[][] arr) {
        for(int j=0;j<arr[0].length;j++) {
            int sum = 0;
            for(int i=0;i<arr.length;i++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Column " + (j+1) + " = " + sum);
        }
    }

    static void getTranspose(int[][] arr) {
        int[][] trans = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose:");
        display(trans);
    }
}
