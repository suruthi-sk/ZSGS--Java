/*
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
*/

class Employee {
    String name;
    int emp_Id;
    String designation;
    double salary;

    Employee() {
        System.out.println("Object has been created using no-argument constructor.");
        this.name = "Default Name";
        this.emp_Id = 0;
        this.designation = "Unassigned";
        this.salary = 0.0;
    }

    Employee(String name, int emp_Id, String designation, double salary) {
        this.name = name;
        this.emp_Id = emp_Id;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee copyEmp) {
        this.name = copyEmp.name;
        this.emp_Id = copyEmp.emp_Id;
        this.designation = copyEmp.designation;
        this.salary = copyEmp.salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_Id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        Employee emp2 = new Employee("John", 1005, "Software Engineer", 50000);

        Employee emp3 = new Employee(emp2);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
