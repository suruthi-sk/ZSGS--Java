/*
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
*/

import java.util.Scanner;

public class Problem8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(allCapital(str))
			System.out.println("true");
		else if(allSmall(str))
			System.out.println("true");
		else if(firstCapital(str))
			System.out.println("true");
		else
			System.out.println("false");
			
	sc.close();
		}
	
	static boolean allCapital(String str){
		String caps = str.toUpperCase();
		
		if( caps.equals(str)) return true;
		else return false;
	}
	
	static boolean allSmall(String str){
		String small = str.toLowerCase();
		
		if(small.equals(str)) return true;
		else return false;
	}
	
	static boolean firstCapital(String str){
		String small = str.substring(1,str.length());
		String capsmall = str.charAt(0)+small.toLowerCase();
		
		if(capsmall.equals(str)) return true;
		else return false;
	}
}