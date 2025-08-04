/*
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
*/

public class Student2{
    String name;
    int roll_no;
    int phone_no;
    String address;

    Student2(String name, int roll_no, int phone_no, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll_no);
        System.out.println("Phone Number : " + phone_no);
        System.out.println("Address : " + address);
		System.out.println();
    }

    public static void main(String[] args){
        Student2 stu1 = new Student2("Sam", 1005, 89898, "Chennai, In");
        Student2 stu2 = new Student2("John", 1002, 789098, "Kerala, In");

        stu1.display();
        stu2.display();
    }
}
