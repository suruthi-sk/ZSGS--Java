/*
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
*/

import java.util.Scanner;

public class Problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int colNo = sc.nextInt();

        System.out.println(getExcelTitle(colNo));
    }

    static String getExcelTitle(int colNo) {
        String result = "";

        while (colNo > 0) {
            colNo--;
            int remainder = colNo % 26;
            char letter = (char) ('A' + remainder);
            result = letter + result;  
            colNo /= 26;
        }

        return result;
    }
}

