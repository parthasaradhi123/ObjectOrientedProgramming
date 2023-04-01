
class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	double add(float a, double b, int c)
	{
		return a+b+c;
	}
	float add(int a, float b)
	{
		return a+b;
	}
	float add(float a, float b, float c)
	{
		return a+b+c;
	}
	double add(int a, double b)
	{
		return a+b;
	}
	double add(double a, double b, double c)
	{
		return a+b+c;
	}
	
	
}

public class MethodOv {

	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		int a=10,b=20,c=30;
		float m = 20.5f, n =12.6f, o =16.6f;
		double x = 20,y=40, z = 50;
		
		System.out.println(cal.add(n, y, c));
		System.out.println(cal.add(a, o));
		System.out.println(cal.add(m, n, o));
		System.out.println(cal.add(a, b));
		
		
	}

}
