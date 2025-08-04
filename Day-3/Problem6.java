/*
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
*/

class Employee{
	String name;
	int year_of_join;
	double salary;
	String address;
	
	Employee(String name, int year_of_join, double salary, String address){
		this.name = name;
		this.year_of_join = year_of_join;
		this.salary = salary;
		this.address = address;
	}
	
	void display(){
		System.out.printf("\n%s \t   %d    \t %s" , name , year_of_join , address);
	}
}

public class Problem6{
	public static void main(String[] args){
		Employee emp1 = new Employee("Robert",1994,60000,"64C- WallsStreat");
		Employee emp2 = new Employee("Sam", 2000,90000, "68D- WallsStreat");
		Employee emp3 = new Employee("John", 1999, 87000, "26B- WallsStreat");
		
		System.out.println("Name \t Year of Joining     Address");
		emp1.display();
		emp2.display();
		emp3.display();
	}
}