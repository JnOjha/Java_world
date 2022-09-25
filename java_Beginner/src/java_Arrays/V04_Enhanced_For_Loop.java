package java_Arrays;

public class V04_Enhanced_For_Loop {
	
	public static void main(String args[]) {
//		
		byte nums[]= {1,2,3};
//		
//		for(byte i=0;i<nums.length;i++)
//			System.out.println(nums[i]);
		
		/*Using this by enhanced for loop*/
		
		for(byte numbers:nums)
		{
			System.out.println(numbers);
		}
	}

}
