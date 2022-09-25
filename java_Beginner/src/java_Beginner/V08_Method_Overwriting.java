package java_Beginner;

class A 
{
	public void show() {
		System.out.println("In A");
	}
}
/* This Method inside B will Override the Class A method*/
class B extends A
{
	@Override		// As we provide Annotation the method name will show error if its different from Parent class method
	public void show() {
//		super.show();		//	When u mention 'super()' then it will call super class also
		System.out.println("In B");
	}	
}
public class V08_Method_Overwriting 
{
	public static void main(String args[]) 
	{
		B objB= new B();
		
		objB.show();
	}

}
