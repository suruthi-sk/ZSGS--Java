/*
Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
*/

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        int[] weights = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weights of 10 people:");

        for (int i = 0; i < 10; i++)
            weights[i] = sc.nextInt();

        selectionSortDescending(weights);

        System.out.println("Sorted weights (Descending):");
        for (int num : weights){
            System.out.print(num + "  ");
        }
    }

    static void selectionSortDescending(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int maxIndex = i; 
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[maxIndex]){ 
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
