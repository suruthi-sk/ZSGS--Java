/*
3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
*/

import java.util.Scanner;

class Employee{
	int empId;
	String name;
	String department;
	double salary;
	
	Employee(int empId, String name, String department, double salary){
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	double calculateSalary(){
		return 12*salary;
	}
	
	void display(){
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Department : " + department);
	}
}

class FullTimeEmployee extends Employee{
	FullTimeEmployee(int empId, String name, String department, double salary){
		super(empId, name, department, salary);
	}
	
	double calculateSalary(){
		return 12*salary;
	}
	
	void display(){
		super.display();
		System.out.println("Monthly Salary : " + salary);
		System.out.println("Annual Salary : " + calculateSalary());
	}
}

class PartTimeEmployee extends Employee{
	double salary;
	double annualSalary;
	
	PartTimeEmployee(int empId, String name, String department, double salary){
		super(empId, name, department, salary);
	}
	
	double calculateSalary(){
		return 12*salary;
	}
	
	void display(){
		super.display();
		System.out.println("Monthly Salary : " + salary);
		System.out.println("Annual Salary : " + calculateSalary());
	}
}

public class Problem3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type Employee you are? \n1.Part time \n2.Full time");
		int n = sc.nextInt();
		
		System.out.print("Enter Employee Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter department ");
		String department = sc.next();
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		
		if(n==1){
			PartTimeEmployee part = new PartTimeEmployee(id, name, department, salary);
			part.display();
		}
		else if(n==2){
			FullTimeEmployee full = new FullTimeEmployee(id, name, department, salary);
			full.display();
		}
		else{
			System.out.println("Enter valid input : ");
		}
	}
}