/*
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
*/

import java.util.Scanner;

public class Problem5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		if(isSubsequence(s,t)) System.out.println("true");
		else System.out.println("false");
	}
	
	static boolean isSubsequence(String s, String t){
		int m = s.length();
		int n = t.length();
		int count = 0;
		int i =0;
		int j =0;
		
		while(i<n){
			if(t.charAt(i)==s.charAt(j)){
				count++;
				i++;
				j++;
			}
			else{
			i++;
			}
			
			if(j==m) break;
		}
		
		if(count == m) return true;
		else return false;
	}
}		