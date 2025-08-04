//1. Illustrates with an example of using Singleton class.


public class Problem1 {
	public static void main(String[] args) {
		SingletonExample object = SingletonExample.getInstance();
		SingletonExample object2 = SingletonExample.getInstance();
		
		object.add(10,67);
		object.sub(98, 76);
		object2.add(90, 80);
		object.sub(89,76);
	}
}

class SingletonExample {
	private SingletonExample() {
		System.out.println("Singleton class Constructor");
	}
	
	static SingletonExample singletonObj;
	
	public static SingletonExample getInstance() {
		if(singletonObj==null) {
			System.out.println("Object is getting created");
			singletonObj  = new SingletonExample();
		}
		
		return singletonObj;
	}
	
	void add(int a, int b){
		System.out.println("Sum : " + (a+b));
	}
	
	void sub(int a, int b){
		System.out.println("Difference : " + (a-b));
	}
}

