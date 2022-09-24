package java_OOPs;


class Outter{	
	
	byte i=5;
	
	public void OutterMethod()
	{
		System.out.println("In Outter method");			
	}
	
	class Inner{
		
		byte j=10;
		
		public void display() {
			
			System.out.println("In insideInnerMethod");
		}
	}
}


public class V04_InnerClass {
	
	public static void main (String args[]) {
		
		
		Outter obj = new Outter();
		System.out.println(obj.i);
		
		Outter.Inner obj1 = obj.new Inner();
		System.out.println(obj1.j);
		obj1.display();
		
		
		
		
	}

}
