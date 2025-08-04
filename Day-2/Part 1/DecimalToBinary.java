/* Decimal to binary*/

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();

        System.out.println("Binary: " + toBinary(decimal));
    }

    static String toBinary(int n) {
        if (n == 0) return "0";

        String binary = "";
        while (n > 0) {
            int remainder = n % 2;      
            binary = remainder + binary; 
            n = n / 2;                   
        }
        return binary;
    }
}
