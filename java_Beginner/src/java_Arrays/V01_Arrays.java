//package java_Arrays;
//
//			/*One Dimensional Array*/
//
//public class V01_Arrays 
//{
//	public static void main(String args[]) 
//	{
//		/* Here we initialize an array with variable 'nums'
//		 * byte[4] mean we gave the size of the array
//		 */
//		byte[] nums=new byte[4];
//		
//		nums[0]=50;
//		nums[1]=51;
//		nums[2]=52;
//		nums[3]=53;
//		
//		for(byte i=0;i<4;i++)
//		{
//			System.out.println(nums[i]);
//		}
//		
//	}
//}

//---------------------------------------------------------------------//
//							v.01
package java_Arrays;

/*One Dimensional Array*/

public class V01_Arrays 
{
	public static void main(String args[]) 
	{
//		Here we can directly put the variable in-> {}
//		if you do this then no need to define array size
		byte[] nums = {1,5,7,9,100}
;
		
		for(byte i=0;i<=4;i++)
		{
			System.out.println(nums[i]);
		}
		
	}
}
