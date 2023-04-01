
//Although we have more main methods the JVM will only consider the main method with String [] args as main method
 // and start point of the programme.
public class MainMethodOverLoading {

	public static void main(String[] args) // V.V.V.IMP interview question
	{
		System.out.println("It's Actually Main Method");
	}
	public static void main(int [] args) 
	{
		System.out.println("int arguments");
	}
	public static void main(double d) 
	{
		System.out.println("double value ");
	}
}
