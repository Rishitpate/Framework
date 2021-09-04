package tests;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=100) {
			System.out.println(i);
			
			if(i==60) {
				System.out.println("Get 60");
				break;
			}
			
			i++;
		}
		

	}

}
