// 6. Develop a Java program to illustrate pass-by-value.

public class Problem6 {
	public static void main(String[] args) {
		String name = "Suruthi";
		int age = 21;
		
		System.out.println("This is print statement from PassByValue method " );
		passByValueExample(name, age);
		System.out.println("\nThis is print statement from main method \nName : " + name + "\nAge: " + age );
	}
	
	static void passByValueExample(String name, int age) {
		System.out.println("This is before change" );
		System.out.println("Name : " + name + "\nAge : " + age );

		name = "Karnika";
		age = 17;

		System.out.println("\nThis is after change" );
		System.out.println("Name : " + name + "\nAge : " + age );
	}
}