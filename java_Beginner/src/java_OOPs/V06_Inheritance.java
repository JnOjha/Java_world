package java_OOPs;
			/* Inheritance means child class inherit the parent Class */


class parrent		// This is the parent class
{
	public int add(int a, int b) {
		
		return a+b;
	}
}

class Child	extends parrent		// This is the child class
{
	public int sub(int a, int b) {
		
		return a-b;
	}
}
class SupChild	extends parrent		// This is the super child class
{
	public int mul(int a, int b) {
		
		return a*b;
	}
}


public class V06_Inheritance 
{
	public static void main(String args[]) 
	{
		SupChild objSupChild = new SupChild();
		
		System.out.println(objSupChild.mul(8, 10));
	}

}
