//Method overloading with numeric promotion/type casting

class Partha 
{
	
	float add(int a, float b)
	{
		return a+b;
	}
	float add(float a , int b, float c)
	{
		return a+b+c;
	}
	
	
}



public class Numeric {

	public static void main(String[] args)
	{
		Partha p = new Partha();
	
		System.out.println(p.add(10,20));
		

	}

}
