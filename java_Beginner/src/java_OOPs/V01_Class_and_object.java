package java_OOPs;

class sum{
	
	byte num1;		// Value are not assigned
	byte num2;
	byte result;
	
	
	public void perform() {		// This is a method
		
		result= (byte) (num1+ num2);
	}
	
	
	
}

public class V01_Class_and_object {
	
	public static void main(String[] args) {
		
		sum obj = new sum(); 		//object knows something and does something
		
		obj.num1=5;
		obj.num2=5;
		obj.perform();
		
		System.out.println(obj.result);
		
	}

}
