package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		
		sum();//4+5
		sum(5,6);//5+6
		sum(11,12);
		sum(100,200);
		sum(1,2,3);

	}

	//Method without Arguments
	public static void sum() {
		int a = 4+5;
		System.out.println(a);
	}
	
	//Method with Arguments
	public static void sum(int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	//Method with 4 Arguments - Overloading, creating 2 methods with same name but with different arguments.
	public static void sum(int p, int q, int r) {
		int a = p+q+r;
		System.out.println(a);
	}
}
