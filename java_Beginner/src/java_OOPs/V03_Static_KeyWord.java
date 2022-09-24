package java_OOPs;

class Emp{
	
	byte eid;
	short salary;
	//String ceo;		//	(v.1) This is an Object specific variable
	static String ceo;  //It will applicable for all the object
	
	/*we can initialize static variable by using static blocks
	 * Static block will execute only once*/
	
	static				//It will execute when you load a class
	{
		ceo="Sandeep";
	}
	
	
	
	
	
	public Emp() {		//This is an Default constructor. Execute when u create an object
	
		/*initializing eid,salary to default. 
		 * Means if vicky, manveer eid and salary is not defined then this Default value will be assigned
		*/		
		eid=1;			
		salary=28116;
	}
	
	
	public void show()
	{
		System.out.println("Emp Id-"+eid+":"+"Salary:"+salary+"|"+"CEO:"+ceo);
	}	
	
}

public class V03_Static_KeyWord {
	
	public static void main(String args[]) {
		
		Emp vicky = new Emp();
		Emp manveer= new Emp();
		
//		vicky.eid=7;			(v.2)
//		vicky.salary=28316;		(v.2)
		//vicky.ceo="Ankush";	(v.1)
		
//		manveer.eid=9;			(v.2)
//		manveer.salary=28216;	(v.2)
		//manveer.ceo="verna";	(v.1)
		
//		Emp.ceo="Julie";		(v.2)
		
		vicky.show();
		manveer.show();
				
	}

}
