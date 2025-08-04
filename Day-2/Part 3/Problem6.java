/*
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
*/

import java.util.Scanner;

public class Problem6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String sum = getSum(s1, s2);
        System.out.println(sum);
    }

    static String getSum(String a, String b) {
        int m = a.length();
        int n = b.length();
        String ans = "";

        int i = m - 1, j = n - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int n2 = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = n1 + n2 + carry;

            ans += (sum % 10);  
            carry = sum / 10;   
        }

        String value = "";
        for (int k = ans.length() - 1; k >= 0; k--) {
            value += ans.charAt(k);
        }

        return value;
    }
}
