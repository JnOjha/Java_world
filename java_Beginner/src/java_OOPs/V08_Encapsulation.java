package java_OOPs;

			/* Encapsulation -> Binding Data with Method */

class Student
{
	int rollno;
	String name;
	
	/*Getters and setters
	 * it means get and set the data respectively */
	
	// You should always follow this convention for Data security
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int i) {
		this.rollno = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class V08_Encapsulation 
{
	public static void main(String argString []) 
	{
		Student objStudent = new Student();
		
		objStudent.setRollno(07);
		objStudent.setName("Vicky");
		
		
		System.out.println(objStudent.getName());
		System.out.println(objStudent.getRollno());	}
}
