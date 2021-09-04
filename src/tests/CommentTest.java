package tests;

public class CommentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName = "Rishit";
		String lastName = "Patel";
		System.out.println("myName");
		
		//- When Java sees the double slash, it will skip this line from execution.
		//-Single Line Comment
		//System.out.println(myName);
		//System.out.println(lastName);
		//System.out.println(myName+lastName);
		//System.out.println(myName+" "+lastName);
		
		//String space = " ";
		//System.out.println(myName+space+lastName);
		
		//When you want to comment multiple lines at the same time, use/*...code....*/
		/*int a = 50;
		int b = 70;
		System.out.println(myName+lastName+a+b); //Even though a and b are integers, because they are being concated using "+" operator, they act as string. We start with String.
		System.out.println(a+b+myName+lastName);//120RishitPatel, because first considering a+b as integers and then string operation. We start with integers.
		
		System.out.println(myName+lastName+(a+b));//priority given to bracket first.
		
		//Method - charAt(index);, takes the object from String class and returns character values of the object by inputing specified integer index position.
		System.out.println(myName.charAt(2));
		System.out.println(myName.charAt(0));*/

	}

}
