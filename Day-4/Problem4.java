/*
4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.
*/

class Employee{
	int empId;
	String name;
	String department;
	
	Employee(int empId, String name, String department){
		this.empId = empId;
		this.name = name;
		this.department = department;
	}
	
	void display(){
		System.out.println("Employee Id : " + empId);
		System.out.println("Name : " + name);
		System.out.println("Department : " + department);
	}
}

class Student{
	int stuId;
	String stuName;
	String stuDept;
	
	Student(int stuId, String stuName, String stuDept){
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	void display(){
		System.out.println("Student Id : " + stuId);
		System.out.println("Name : " + stuName);
		System.out.println("Department : " + stuDept);
	}
}

class Person extends Employee,Student{
	Person(int empId, String name, String department){
		super(empId, name, department);
	}
}

public class Problem4{
	public static void main(String[] args){
		Person p = new Person(5, "James", "IT");
		p.display();
	}
}