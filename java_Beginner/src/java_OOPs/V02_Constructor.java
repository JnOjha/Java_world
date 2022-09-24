package java_OOPs;

class Calc{
	
	byte num1;
	byte num2;
	byte result;
	
	/* Constructor is a member method. Thats why its required a round bracket
	 * Constructor don't return value
	 * Constructor name should be same as class name
	 * Constructor will be called automatically when the object is created
	 * */
	
	public Calc() {			// This is a Default constructor. It don't have any parameter
		
		num1=5;
		num2=6;	
		System.out.println("in default constructor");
	}
	/* Constructor having different parameter call: Constructor Overloading*/
	public Calc(byte n, byte m) {   // from line 22-33, these both are  constructor 
		
		num1=n;
		num2=m;
		
	}
	
	public Calc (float i) {
		
		num1=(byte)i;
		num2=(byte)i;
	}
	 
}


public class V02_Constructor {
	
	public static void main(String args[]) {
		
		Calc obj =  new Calc(10);		//Constructor
		
		System.out.println(obj.num1);
		
		
		
	}

}
