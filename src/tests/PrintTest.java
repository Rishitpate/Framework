package tests;

public class PrintTest {

	public static void main(String[] args) {
		
		//System.out.print - Print in the line and set the pointer to the same line.
		System.out.print("Selenium");
		System.out.print("Postman");
		System.out.print("ReadyAPI");
		
		System.out.println("Jira"); //Print in the same line and THEN set the pointer to the next line.
		System.out.print("TestLink");//Prints in the next line (because of above line) and keep the pointer to the same line.
		System.out.println("Jenkins");//Prints in the same line as above and THEN set the pointer to the next line.
		
		System.out.print("Git");//Git on the next line because above is println and THEN set the pointer to the same line.
		System.out.println(); //set the pointer to the next line.
		System.out.print("SVN");//next line to Git.

	}

}
