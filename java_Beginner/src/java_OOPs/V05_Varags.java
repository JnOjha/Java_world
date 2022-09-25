package java_OOPs;

class IntAdd
{
//	public int add(int i, int j) { 		//use this while passing parameter
		
	public int add(int...j) {		// This is a variable length Arguments. This will treated as an array.
/* This will treated as an array.
 * all the value passed by user will be stored in array "j"
 * then we sum it through enhanced for loop*/	
		int sum=0;
		for(int k:j)
		{
			sum=sum+k;
		}
		return sum;
	}	
}

public class V05_Varags 
{
	public static void main(String args[]) 
	{	
		IntAdd objAdd = new IntAdd();
		System.out.println(objAdd.add(78, 98,1,1,5,1,6549));	//all the value given by u will be assigned to array "j"
	}
}
