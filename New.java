class Student123
{
	static
	{
		 System.out.println(".class file is loading");
	}
	
	Student123()
	{
		System.out.println("I am a student class constructor :");
	}
}
public class New {

	public static void main(String[] args) 
	{
		Student123 s = new Student123();
		

	}

}
