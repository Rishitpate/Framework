package tests;

public class DataTypesTest {

	public static void main(String[] args) {
		
		
		//Java executes code line by line.
		//Java takes the last value.
		//integers - to save numbers
		int i = 10;
		System.out.println(i); //10
		i = 20;
		System.out.println(i);//20
		i = i+10;
		System.out.println(i);//30
		i = i*2;
		System.out.println(i);//60
		System.out.println(i*2);//120 -Just Printing, not updating value of i.
		System.out.println(i);//60; Last Value of i, is still 60.
		System.out.println(i++); //60, print value of i and THEN post increment.
		System.out.println(i);//61, because of above line.
		System.out.println(++i);//62, post increment first and then print.
		
		//Character - to save any single digit, whether its number or alphabet.
		char a ='b';
		System.out.println("a");//a
		System.out.println(a);//b
		
		char c ='2'; //saving a number as a character, we cannot perform arithmetic operations on characters.
		System.out.println(c);
		
		//double = save numbers with decimals.
		double d = 10.5;
		System.out.println(d);
		System.out.println(d*3);
		
		//boolean - save true or false
		boolean p = true;
		System.out.println(p);
		
		p = false;
		System.out.println(p);
		
		
	}

}
