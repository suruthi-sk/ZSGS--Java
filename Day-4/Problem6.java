/*
6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. 
*/

import java.util.Scanner;

class MyString{
    private char[] data;

    public MyString(char[] arr){
        data = new char[arr.length];
        for (int i = 0; i< arr.length; i++){
            data[i] = arr[i];
        }
    }

    public MyString(String str){
        data = new char[str.length()];
        for (int i = 0; i<str.length(); i++){
            data[i] = str.charAt(i);
        }
    }	

    public int length(){
        return data.length;
    }

    public char charAt(int index){
        return data[index];
    }

    public boolean equals(MyString other){
        if (this.length() != other.length()) return false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != other.data[i]) return false;
        }
        return true;
    }

    public MyString toUpperCase(){
        char[] upper = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            char ch = data[i];
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            upper[i] = ch;
        }
        return new MyString(upper);
    }

    public MyString toLowerCase(){
        char[] lower = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            char ch = data[i];
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
            lower[i] = ch;
        }
        return new MyString(lower);
    }

    public MyString substring(int start, int end){
        char[] sub = new char[end - start];
        for (int i = start, j = 0; i < end; i++, j++){
            sub[j] = data[i];
        }
        return new MyString(sub);
    }

    public MyString concat(MyString other){
        char[] result = new char[this.length() + other.length()];
        for (int i = 0; i < this.length(); i++){
            result[i] = data[i];
        }
        for (int i = 0; i < other.length(); i++){
            result[this.length() + i] = other.data[i];
        }
        return new MyString(result);
    }

    public boolean contains(MyString sub){
        if (sub.length() == 0 || sub.length() > this.length()) return false;

        for (int i = 0; i <= this.length() - sub.length(); i++){
            int j = 0;
            while (j < sub.length() && data[i + j] == sub.data[j]){
                j++;
            }
            if (j == sub.length()) return true;
        }
        return false;
    }

    public int indexOf(char ch){
        for (int i = 0; i < data.length; i++){
            if (data[i] == ch) return i;
        }
        return -1;
    }

    public MyString replace(char oldChar, char newChar){
        char[] replaced = new char[data.length];
        for (int i = 0; i < data.length; i++){
            replaced[i] = (data[i] == oldChar) ? newChar : data[i];
        }
        return new MyString(replaced);
    }

    public String toString(){
        return new String(data);
    }
}


public class Problem6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        MyString my = new MyString(str);

        boolean flag = true;

        while (flag){
            System.out.println("\nMENU");
            System.out.println("1. length()");
            System.out.println("2. charAt()");
            System.out.println("3. equals()");
            System.out.println("4. toUpperCase()");
            System.out.println("5. toLowerCase()");
            System.out.println("6. substring()");
            System.out.println("7. concat()");
            System.out.println("8. contains()");
            System.out.println("9. indexOf()");
            System.out.println("10. replace()");
            System.out.println("11. Exit");
            System.out.print("\nEnter your choice: ");

            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Length of the string: " + my.length());
                    break;

                case 2:
                    System.out.print("Enter the index: ");
                    int index1 = sc.nextInt();
					if(index1 > my.length()) System.out.println("Invalid input");
                    else System.out.println("Character at index " + index1 + ": " + my.charAt(index1));
                    break;

                case 3:
                    System.out.print("Enter the string to compare: ");
                    String compStr = sc.next();
                    MyString other = new MyString(compStr);
                    if (my.equals(other)){
                        System.out.println("Both strings are the same.");
                    }else{
                        System.out.println("Strings are different.");
                    }
                    break;

                case 4:
                    System.out.println("Uppercase: " + my.toUpperCase());
                    break;

                case 5:
                    System.out.println("Lowercase: " + my.toLowerCase());
                    break;

                case 6:
                    System.out.print("Enter start and end index: ");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    System.out.println("Substring: " + my.substring(start, end));
                    break;

                case 7:
                    System.out.print("Enter the string to concatenate: ");
                    String conStr = sc.next();
                    MyString concatStr = new MyString(conStr);
                    System.out.println("Concatenated string: " + my.concat(concatStr));
                    break;

                case 8:
                    System.out.print("Enter substring to check: ");
                    String subStr = sc.next();
                    MyString sub = new MyString(subStr);
                    System.out.println(my.contains(sub) ? "The given substring is present in the given string." : "The given substring is not found in the string.");
                    break;

                case 9:
                    System.out.print("Enter character to find index: ");
                    char chFind = sc.next().charAt(0);
                    int index = my.indexOf(chFind);
                    System.out.println(index != -1 ? "Index: " + index : "Character not found.");
                    break;

                case 10:
                    System.out.print("Enter character to replace and new character: ");
                    char c1 = sc.next().charAt(0);
                    char c2 = sc.next().charAt(0);
                    System.out.println("After replacement: " + my.replace(c1, c2));
                    break;

                case 11:
                    System.out.println("Exiting...:)");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
