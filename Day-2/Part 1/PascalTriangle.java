/*
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
*/

import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal Triangle: ");
        int n = sc.nextInt(); 

        int i = 0; 

        do {
            int s = 0;
            do {
                if (s < n - i - 1)
                    System.out.print(" ");
                s++;
            } while (s < n);

            int k = 0;
            int num = 1;
            do {
                if (k == 0)
                    num = 1; 
                else
                    num = num * (i - k + 1) / k; 

                System.out.print(num + " ");
                k++;
            } while (k <= i);

            System.out.println();
            i++;
        } while (i < n);
    }
}
