/*
1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

import java.util.Scanner;

public class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(getSum(s1, s2));
    }

    static String getSum(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = (i >= 0)?a.charAt(i--) - '0' : 0;
            int n2 = (j >= 0)?b.charAt(j--) - '0' : 0;

            int sum = n1 + n2 + carry;
            result += (sum % 2); 
            carry = sum / 2;      
        }

        String finalResult = "";
        for (int k = result.length() - 1; k >= 0; k--) {
            finalResult += result.charAt(k);
        }

        return finalResult;
    }
}
