/*
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
*/

package com.stringutils;
import java.util.Scanner;

public class StringUtils{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
	}
	
	public String concatStr(String s1, String s2){
		return s1+s2;
	}
	
	public String reverseStr(String s1){
		String reverse = "";
		
		for(int i=s1.length()-1;i>=0;i--){
			reverse += s1.charAt(i);
		}
		
		return reverse;
	}
	
	public int lengthOfStr(String s1){
		return s1.length();
	}
}