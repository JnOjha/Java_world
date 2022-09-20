package java_Beginner;

public class V04_Switch_Case {

	public static void main(String[] args) {
		//double will not work
		
		byte i = 2;
		
		switch (i) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		default:
			System.out.println("No Match");
		
		}

	}

}
