package pkg2;

public class student2 
{  // boundary(body)of the class 
	int rollno; // created a variable named rollno
	int age; // created a variable named age
	public void abc () // method name abc
	{ //boundary of the method 
		System.out.println("welcome to all of you");
		System.out.println("automation is very easy");
		
	}
	public static void main(String[] args) 
	{ // boundary of the main method
		student2 xyz= new student2(); // piller3
		xyz.abc(); // calling the method
		xyz.rollno=5;
		System.out.println(xyz.rollno);
		xyz.abc();// calling the method
		xyz.age=45;
		System.out.println(xyz.age);
	}	
}
