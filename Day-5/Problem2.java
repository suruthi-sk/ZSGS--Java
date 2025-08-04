/*
2. Can we override private method, constructor, static method, final method? Illustrate with an example.
*/

class Example{
	Example(){
		System.out.println("This is constructor");
	}
	
	private int add(int a, int b){
		System.out.println("This is private");
		return a+b;
	}
	
	static void checkStatic(){
		System.out.println("This is static");
	}
	
	final void checkFinal(){
		System.out.println("This is final");
	}
}

class Example2 extends Example{
	Example2(){
		System.out.println("This is constructor");
	}
	
	int add(int a, int b){
		System.out.println("This is overriden private");
		return a+b+b+a;
	}
	
	static void checkStatic(){
		System.out.println("This is overriden static");
	}
	
	void checkFinal(){
		System.out.println("This is overriden final");
	}
}

public class Problem2{
	public static void main(String[] args){
		Example2 ex = new Example2();
		
		ex.add(5,7);
		ex.checkStatic();
		ex.checkFinal();
	}
}

/*
Result:

Private --> cannot be overriden. Just another new method is created in the subClass.
Constructor --> They cannot be overriden. They can only called from the child class using super() keyword.
static --> cannot be overriden. It is method hiding not override.
final --> Final cannot be overriden hence it shows compilation error.

*/
