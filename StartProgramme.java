	// blue print of a class Student
	class Student
	{
		// HAS - part( Instance Variables)
		int sid = 7;
		String name = "partha";
		
		//DOES - Part(methods)
		void playCricket()
		{
			System.out.println("Student is Playing Cricket");
		}
		void sleep()
		{
			System.out.println("Student is sleeping");
		}
		
	}
	
// Using StartProgramme class to test our code 
class StartProgramme 
{
	// DrivingCode --> Automatically called by the jvm
	public static void main(String[] args) 
	{
		 // Step1: Create an object for Student class
		       Student std = new Student();
		       System.out.println(std.sid); // you can access those instance variables by objectname.variable
		       System.out.println(std.name);
		       
		       std.playCricket(); //here we are calling the method using the class 
		       std.sleep();

	}

}
