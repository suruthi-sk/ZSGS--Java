/*
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
*/

package com.arithmetic;
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public int multiple(int a, int b){
		return a*b;
	}
	
	public int divide(int a, int b){
		return a/b;
	}
	
	public int modulo(int a, int b){
		return a%b;
	}
}
