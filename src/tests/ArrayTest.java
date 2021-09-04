package tests;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tool = "Selenium";
		System.out.println(tool);
		
		System.out.println("-----------------------String Array------------------------");
		
		//When you want to save more than one value, we use arrays.
		//Array of strings, integers, characters, doubles.
		//Format: ClassName objName [] = {"s1","s2"..."sN"};
		String tools[] = {"Selenium", "Jira", "Junit", "TestNG","Git"};
		
		//Method - length();, method of class Array, gives length/number of objects in an array, Returntype is integer.
		System.out.println(tools.length);
		
		//objName[integer index] - takes the integer argument of the ArrayName and returns the value at the specified index.		
		/*System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);*/
		
		//Using for loop to print the values of tools array.
		for(int i = 0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}

		System.out.println("-------------------------Int Array---------------------------");
		//Format: DataType variable[] = {int 1, int 2, ... int n};
		int numbers[] = {3, 17, 100, 1245, 2260};
		System.out.println(numbers.length);
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//Object - class which allows to save arrays of mixed values; Strings and numbers.
		System.out.println("-----------------------Object Array-----------------------------");
		Object mix[] = {"Selenium", 50};
		System.out.println(mix.length);
		
		System.out.println(mix[0]);
		System.out.println(mix[1]);
		
	}
	

}
