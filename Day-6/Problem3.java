/*
Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.
*/


class Employee{
	private int empId;
	private String name;
	private String designation;
	private String department;
	private double salary;
	
	Employee(int empId,  String name, String designation, String department, double salary){
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public void setDesignation(String designation){
		this.designation = designation;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double annualSalary(){
		return salary*12;
	}
	
	void display(){
		System.out.println("Employee Id  : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Department : " + department);
		System.out.println("Monthly Salary : " + salary);
	}
}

public class Problem3{
	public static void main(String[] args){
		Employee emp = new Employee(1001, "John", "SDE", "IT", 190000);
		emp.display();
		System.out.println("Annual Salary : "+ emp.annualSalary());
	}
}