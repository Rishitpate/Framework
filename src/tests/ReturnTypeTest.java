package tests;

public class ReturnTypeTest {

	//ReturnTypes - Integer, Double, String, Character
	public static void main(String[] args) {
		
		int x = sum();
		System.out.println(x);
		System.out.println(sum());
		
		String z = hello(); //hello() returns "s", which is a string.
		
	}

	//ReturnType Void - returns nothing
	public static void nothing() {
		int a = 4+5;
	}
	
	//ReturnType Integer, you need the"return"statement.
	public static int sum() {
		int a = 4+5;
		return a;
	}
	
	public static String hello() {
		String s = "Hello Java";
		return s;
	}
	
}
