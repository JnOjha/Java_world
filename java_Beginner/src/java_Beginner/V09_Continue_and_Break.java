package java_Beginner;

public class V09_Continue_and_Break {
	
	public static void main (String [] args) {
		
		
		for (byte i=1;i<10;i++) {
			
			if (i==4)
				continue;		// Continue is a jump over statement, but still it will continue with the statement
			
			System.out.println("number->"+i);
			
			
	/*		for (byte i=1;i<10;i++) {
				
				if (i==4)
					break;		// Break will jump out from the loop
				
				System.out.println("number->"+i);	*/
		
		}
	}
	

}
