/*
Pattern 4

w
w w
w w w
w w
w

*/

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (odd number): ");
        int n = sc.nextInt();

        int i = 0;

        while (i <= n / 2) {
            int j = 0;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i++;
        }

        i = n / 2;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
