/* Print pattern
  1
 2 3
4 5 6
 7 8
  9
*/

import java.util.Scanner;

public class Pattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        int num = 1;
        int row = 1;

        int mid = (n / 2) + 1;  
        int spaces = mid - 1;   
        int count = 1;          

        while (row <= n) {
            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            int k = 0;
            while (k < count) {
                System.out.print(num + " ");
                num++;
                k++;
            }

            System.out.println();

            if (row < mid) { 
                spaces--;
                count++;
            } else { 
                spaces++;
                count--;
            }

            row++;
        }
    }
}

