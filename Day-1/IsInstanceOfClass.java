//  Write a program to check whether the object is an instance of a particular class

class Person {
    String name;
}

public class IsInstanceOfClass{
    public static void main(String[] args){
        Person p = new Person();
		IsInstanceOfClass ins = new IsInstanceOfClass(); 

        System.out.println(p instanceof Person);  
        System.out.println(p instanceof Object); 
		System.out.println(ins instanceof IsInstanceOfClass);
    }
}
