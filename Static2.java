class Partha1
{
	static int a; // memory will be assigned in the heap area that to once during class loading time.
	static int b;
	
	static 
	{
		System.out.println("I am in a static block which is present in partha1 class ");
		a = 10;
		b = 10;
		System.out.println(a+b);	
	}
	
	
	public Partha1()
	{
		System.out.println("I am in constructor ");
	}
	
	int x; // Memory will be allocated inside the object 
	int y;
	
	public Partha1(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("addition of two values : " +x+y);
	}
	

	{
		System.out.println(" I am in java block ");
	}
}
public class Static2 
{
	static int x;
	static int y;
	
	static 
	{
		System.out.println(" I am in static block which is present in main class ");
		x = 5;
		y = 5;
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		Partha1 p = new Partha1();
		Partha1 p1 = new Partha1(4,8);

		
 
		 
	}

}
