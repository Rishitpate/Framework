package tests;

public class ConditionsTest {

	public static void main(String[] args) {
		// In verification, we use Condition Test
		
		int a = 20; // single "=" means assignment of value to a variable
		int b = 20;
		
		//== means is equal to 
		if(a==b) {
			System.out.println("A and B are equal");
		}else {
			System.out.println("A and B are not equal");
		}

		//Syntax for If-Else Statements.
		/*if(condition) {
			code for if statement
		} else {
			code for else
		}*/
		
		String actual = "Selenium";
		String expected = "selenium";
		
		//Method - equals(); is a method of string class, which is used to compare two String objects.
		if(actual.equals(expected)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
