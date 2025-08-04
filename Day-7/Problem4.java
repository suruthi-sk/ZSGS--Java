/*
4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
*/

import java.util.Scanner;

interface Employee {
	public double calculateSalary();
	public void display();
}

class FullTimeEmployee implements Employee{
	private int empId;
	private String name;
	private String department;
	private int leaveDays;
	private double salary = 50000;
	
	FullTimeEmployee(int empId, String name, int leaveDays, String department){
		this.empId = empId;
		this.name = name;
		this.leaveDays = leaveDays;
		this.department = department;
	}
	
	int getEmpId(){
		return empId;
	}
	
	void setEmpId(int empId){
		this.empId = empId;
	}
	
	String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAbsentDays(){
		return leaveDays;
	}
	
	void setAbsentDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	
	String getDepartment() {
		return department;
	}
	
	void setDepartment(String department) {
		this.department = department;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateSalary() {
		double daySalary = salary/30;
		return daySalary*(30-leaveDays);
	}
	
	public void display() {
		System.out.println();
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Type : Full time Employment" );
		System.out.println("Department : " + department);
		System.out.println("Monthly Salary : " + calculateSalary());
	}
}

class PartTimeEmployee implements Employee {
	private int empId;
	private String name;
	private String department;
	private double salary = 222;
	private int workingHours;
	
	PartTimeEmployee(int empId, String name, String department, int workingHours) {
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.workingHours = workingHours;
	}
	
	int getEmpId(){
		return empId;
	}
	
	void setEmpId(int empId){
		this.empId = empId;
	}
	
	String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getDepartment() {
		return department;
	}
	
	void setDepartment(String department) {
		this.department = department;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateSalary(){
		return (double)workingHours*salary;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Type : Part time Employment" );
		System.out.println("Department : " + department);
		System.out.println("Salary (per hour) : " + salary);
		double sal = calculateSalary();
		System.out.println("Monthly Salary : " + (int)calculateSalary());
	}
}

public class Problem4{
	public static void main(String[] args){
		Employee emp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Employee name : ");
		String name = sc.nextLine();
		System.out.print("Enter Department : ");
		String dept = sc.nextLine();
		System.out.print("1. Full time Employee \n2.Part time employee \n Enter your choice : ");
		int type = sc.nextInt();
		
		if(type==1){
			System.out.print("Enter number of days you have taken leave : ");
			int days = sc.nextInt();
			emp = new FullTimeEmployee(id, name, days, dept); 
			emp.display();
		} else if(type==2) {
			System.out.print("Enter your working hours : ");
			int hours = sc.nextInt();
			emp = new PartTimeEmployee(id, name, dept, hours);
			emp.display();
		} else {
			System.out.print("Invalid input!");
		}
	}
}