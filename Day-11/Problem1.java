/*
1. Write a Java program to read the contents of a text file and display it on the console.
*/

import java.util.Scanner;
import java.io.*;

public class Problem1 {
    public static void main(String[] args) {
        try {
            File file = new File("Text1.txt");
            Scanner scan  = new Scanner(file);

            System.out.println("Displaying file");
            while(scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch(FileNotFoundException e) {
            System.out.print("Error occured. For more details --> ");
             e.printStackTrace();
        }
    }
}
