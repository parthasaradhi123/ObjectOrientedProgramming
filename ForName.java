import java.util.*;

class STudent
{
	static
	{
		System.out.println(".Class File Loading");
	}
	
	public STudent()
	{
		System.out.println("hello mf");
	}
}



public class ForName {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		System.out.println("enter you class Name");
		Scanner sc = new Scanner(System.in);
		
		//Take the input of the class name for which object has to be created at run time.
		String className = sc.nextLine();
		
		//load the class file explicity
		Class c = Class.forName(className);
		
		//For the loaded class object is created using zero parameterized constructor.
		Object o = c.newInstance();
		
	 //	String  s= (String)o;
	 	STudent s = (STudent)o;
		
	}

	 

}
