/*
1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/

public class Students{
	String name ;
	int roll_no;
	
	public static void main(String[] args){
		Students stu = new Students();
		
		stu.roll_no = 2;
		stu.name = "John";
		
		System.out.println("Roll number : " + stu.roll_no + "\nName : " + stu.name);
	}
}