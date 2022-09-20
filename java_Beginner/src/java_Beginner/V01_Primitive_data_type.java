package java_Beginner;

public class V01_Primitive_data_type {

	public static void main(String[] args) {

		long l= 5000000000000l;	// 8 bytes -> 64 bits
		int i = 52;	// 4 bytes -> 32 bits
		short s = 5;	// 2 bytes -> 16 bits range (-32768 to 32767)
		byte b = 7;		// 1 bytes -> 8 bits range (-128 to 127)
		float f = 5.5f;	// f is required here
		double d = 5.5;
		
		char c = 'a';
		c = 66;		// American Standard code for information interchange
		
		System.out.println(c);
		
		
		double d1 = 5; 	//implicit conversion
		int k = (int)5.6;	//type casting
		System.out.println(k);		
		
	}

}
