/*
 Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them
*/

import java.util.Scanner;

class Employee{
	int empId;
	String name;
	String department;
	double salary;
	
	void Employee(int empId, String name, String department, double salary){
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter Employee Id: " );
		emp.empId = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		emp.name = sc.next();
		System.out.println("Enter department : ");
		emp.department = sc.next();
		System.out.println("Enter Salary : ");
		emp.salary = sc.nextDouble();
		
		System.out.println("--------- DISPLAYING RESULT ---------"); 
		System.out.println("Employee Id \t Name \t department \t Salary "); 
		System.out.println(emp.empId + "\t\t" + emp.name + "\t\t" + emp.department + "\t" + emp.salary);
	}
}