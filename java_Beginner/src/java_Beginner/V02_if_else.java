package java_Beginner;

public class V02_if_else {

	public static void main(String[] args) {

		byte i=7;
		
		if (i<5)
			System.out.println("lesser than 5");
		
		else if (i>6&&i<10)
		{
			System.out.println("greatet than 6 & leser than 10");
			System.out.println("need curli bracket");			
		}
			
		
		else
			System.out.println("greater");
	}

}
