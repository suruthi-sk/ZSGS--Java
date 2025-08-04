/*
 * 2. Write a Menu driven Java program 
 * a) to read content from the user and write it into another file and 
 * b) from the file to another file 
 * c) to modify the content of a file 
 * d) to search for a particular word in a file and display how many times it appears 
 * e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
 */

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

class MyFile {
    void writeInput(String data) {
        try {
            FileWriter writer = new FileWriter("Text2.txt");
            
            writer.write(data);
            System.out.println("Data is added to the file successfully");
            writer.close();
        } catch(Exception e) {
            System.out.println("Error occured ---> ");
            e.printStackTrace();
        }
    }

    void copyFile(String source, String destination) {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);

        try {
            Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch(Exception e) {
            System.out.println("Error occured -->");
            e.printStackTrace();
        }
    }

    void modifyContent(String data) {
        try {
            FileWriter writer = new FileWriter("Text2.txt", true);
            writer.write(data);
            System.out.println("File modified successfully...!");
            writer.close();
        } catch(Exception e) {
            System.out.println("Error occured ---> ");
            e.printStackTrace();
        }
        //writer.close();
    }
}


public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyFile myFile = new MyFile();
        usingFile();

        boolean flag = true;

        while(flag) {
            System.out.println("Enter choice : \n1.Write file \n2.copy file content to another file \n3.Modify file content \n4.Search a word \n5.Make CSV \n6.Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter your data to add in file");
                    String data = sc.nextLine();

                    myFile.writeInput(data);  
                    break;
                    
                case 2:
                    System.out.println("Enter source file");
                    String source = sc.next();

                    System.out.println("Enter destination file");
                    String destination = sc.next();

                    myFile.copyFile(source, destination);
                    break;

                case 3:
                    System.out.println("Enter the content : ");
                    data = sc.nextLine();

                    System.out.println("1. Overwrite \n2.Append");
                    int opt = sc.nextInt();

                    if(opt==1) myFile.writeInput(data);
                    else myFile.modifyContent(data);
                
            }
        }
        sc.close();
    }

    static void usingFile() {
        try {
            File file = new File("Text2.txt");

            if(file.createNewFile()) {
                System.out.println("New File is created");
            } else {
                System.out.println("Existing file is getting modified");
            }
        } catch(Exception e) {
            System.out.println("Error occured ---> ");
            e.printStackTrace();
        }
    }
}
