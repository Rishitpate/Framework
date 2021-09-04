package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//Array is of fixed size, I cannot add any new value or remove a value at some time.
		//ArrayList allows you to add or remove values from Array at any time.
		
		//How to create an object of the class
		//ClassName objName = new ClassName();
		
		//ArrayList is a built-in class of Java, which takes the arguments in the form of Strings, integers, double, characters.
		ArrayList<String> tools = new ArrayList<String>(); //created an object "tools" of the class ArrayList.
		
		// .add(); - is a method of class ArrayList, allows one to add a value to the ArrayList
		tools.add("Selenium");
		tools.add("Jira");
		tools.add("TestLink");
		tools.add("TestRail");
		
		// .size(); - is a method of class ArrayList, allows one to get the size of ArrayList, returnType is an integer.
		System.out.println(tools.size());
		
		//.get(); is a method of class ArrayList, takes the argument (integer index) allows one to get the value at the specified index.
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.add("Git");
		tools.add("Jenkins");
		System.out.println(tools.size());
		
		System.out.println("----------------------------------");
		System.out.println(tools.get(2));
		tools.remove(2); //.remove - is a method of class ArrayList, takes the argument (integer index) which allows one to remove a value from ArrayList at the specified index.
		System.out.println(tools.get(2));
		
		System.out.println("---------------------------------------");
		
		/*for(int i=0; i<tools.size();i++) {
			System.out.println(tools.get(i));
		}*/
		
		for(String s : tools) {
			System.out.println(s);
		}

	}

}
