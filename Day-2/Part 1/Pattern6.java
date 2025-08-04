/*
Pattern 6

ZOHO
CORP
ORAT
IONS

*/

import java.util.Scanner;

public class Pattern6 {
    static int sqrNo = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        if (isSquare(str)) 
            printPattern(str);
        else 
            System.out.println("This cannot be printed in given pattern");
    }

    static boolean isSquare(String str) {
        int n = str.length();
        int i = 1;
        do {
            if (i * i == n) {
                sqrNo = i;
                return true;
            }
            i++;
        } while (i <= n / 2);
        return false;
    }

    static void printPattern(String str) {
        int index = 0;
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print(str.charAt(index++));
                j++;
            } while (j < sqrNo);
            System.out.println();
            i++;
        } while (i < sqrNo);
    }
}
