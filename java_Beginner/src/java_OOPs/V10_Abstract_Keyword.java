package java_OOPs;

			/* Abstract Keyword*/
// If you make a class as abstract then you can't create object for that class
// Only you can Inherit for that class

abstract class Human
{
	public void eat()
	{
		
	}
	
	public void walk()
	{
		
	}
}
public class V10_Abstract_Keyword 
{
	public static void main (String arg[]) {
		
		Human objHuman=new Human();  //Because of the Abstract Keyword you can't create the object
	}

}
