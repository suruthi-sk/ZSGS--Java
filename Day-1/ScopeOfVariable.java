// Scope of variable

public class ScopeOfVariable{
	static int s ;
	String str;
	
	public static void main(String[] args){
		ScopeOfVariable obj = new ScopeOfVariable();
		int a = 10;
		obj.str = "Hello";
		s = 100;
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(obj.str);
	}
}