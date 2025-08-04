// Program to illustrate static and initialilzer block


public class StaticAndInitializer{
	
	{
		System.out.println("Initializer block 1 ");
	}
	
	static{
		System.out.println("This is a static block");
	}
	
	{
		System.out.println("Initializer block");
	}
	
	public static void main(String[] args){
		StaticAndInitializer sI = new StaticAndInitializer();
		System.out.println("Main block");
	}
}
		