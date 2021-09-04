package tests;

public class StringTest {

	public static void main(String[] args) {
		
		//String- When we want to save words or sentences or a combination of alphabets and numbers as a word.
		//String is a class in Java, not a data type.
		//There are many other methods in the String class.
		String myName = "Rishit";
		String lastName = "Patel";
		System.out.println("myName");
		System.out.println(myName);
		System.out.println(lastName);
		System.out.println(myName+lastName);
		System.out.println(myName+" "+lastName);
		
		String space = " ";
		System.out.println(myName+space+lastName);
		
		int a = 50;
		int b = 70;
		System.out.println(myName+lastName+a+b); //Even though a and b are integers, because they are being concated using "+" operator, they act as string. We start with String.
		System.out.println(a+b+myName+lastName);//120RishitPatel, because first considering a+b as integers and then string operation. We start with integers.
		
		System.out.println(myName+lastName+(a+b));//priority given to bracket first.
		
		//Method - charAt(index);, takes the object from String class and returns character values of the object by inputing specified integer index position.
		System.out.println(myName.charAt(2));
		System.out.println(myName.charAt(0));

	}

}
