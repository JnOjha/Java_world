package java_OOPs;

		/* for constructor	*/


class A 
{
	public A()
	{
		System.out.println("in A");
	}
	
	public A(int i) 
	{
		System.out.println("In Int A");		
	}
}
class B extends A
//Every sub constructor has 'super()' method by default. 
//Thats y if you pass any parameter, then default constructor ll be called 

{
	public B()
	{
		super(8);			//it will be there as default. coz its a sub constructor.
		System.out.println("In B");
	}
	
	public B(int i)
	{
		super();			// if u pass parameter here thn it ll call parrent parameterize constructor
		System.out.println("In Int B");
	}
}

public class V07_Super_Method 
{
	public static void main(String args[]) 
	{
		B objB = new B();
		
		/*If you pass any parameter then parent default constructor will be called. (Not default parameterize one) */
		
	}
}
