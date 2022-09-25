package java_OOPs;
				/* Final Keyword */

// You can Final class and method
/* Final class-> Sub class can't inherit you
 * final method-> Sub class method can't override you
 * */
//It can Just act like also constant

//final class A 	//E.g final class
class Ac
{
//	public final void show() { //E.g final method
	public void show() {
		System.out.println("in A");
	}
}
class Bc extends Ac
{
	public void show() {	
		System.out.println("in ");
	}
}
public class V11_FinalKeyword 
{
	public static void main (String args[]) {
		
		Bc objB=new Bc();
	}

}
