package tests;

import selenium.Test4;

public class Test1 {
	
	//First global variables, then main method
	//ClassName objName = new ClassName();

	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2(); //created an object named t2 for the the class Test2, runs constructor of class Test2
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	public static void main(String[] args) {
		
		System.out.println("I am in main method");
		printMe();
		System.out.println("After PrintMe");
		scanMe();
		t1.testMe();
		t1.deleteMe();
		Test2.red(); //Calling static method from different class, classname.method();
		t2.blue(); //Calling a non-static method from different class, object.method();
		Test3.circle();
		t3.square();
		Test4.bmw();
		t4.audi();
				
	}
	
	public static void printMe() {
		System.out.println("PrintMe");
		}
	
	public static void scanMe() {
		System.out.println("scanMe");
	}
	
	public void testMe() {
		System.out.println("TestMe");
	}
	
	public void deleteMe() {
		System.out.println("DeleteMe");
	}
}
