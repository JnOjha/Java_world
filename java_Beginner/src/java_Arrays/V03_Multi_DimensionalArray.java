package java_Arrays;


public class V03_Multi_DimensionalArray {
	
	public static void main(String args[]) {
		
		byte a[]= {1,2,3,7,89};
		byte b[]= {1,2,3};
		byte c[]= {1,2,3};

		
		byte d[][]= 
			{
					{1,2,3},
					{4,5,6},			//to create one after another array put 'Comma(,)'
					{7,8,9},
			};
		
//		
//		for (int i = 0; i < d.length; i++) {
//			for (int j = 0; j < d[i].length; j++) {
//				System.out.print(d[i][j]);
//			}
//			System.out.println();
//		}
//		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
