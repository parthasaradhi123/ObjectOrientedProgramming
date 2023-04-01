class Partha
{
	static int a;
	static int b;
	static int count =0;
	static
	{
		System.out.println("Im in static block which will be executed before main method..");
		a = 10;
		b = 20;
		System.out.println(a+b);
		//x = 20;
		//y =20; compiler will shout right and left.
		//we cannot assign non static field to static refernce.
	}
	static
	{
		System.out.println("I am in second static block ");
		
	}
	
	static void disp()
	{
		System.out.println("I am in static method ");
	}
	
	int x;
	int y;
	int count1 =0;
	{
	  count++;
	  count1++;
	}
	Partha()
	{
		System.out.println("I am in constructor 1");
		count1++;
		count++;
	}
	
	Partha(int x)
	{
		this.x = x;
		System.out.println("I am in constructor 1");
		count1++;
		count++;
	}
	
	Partha(int x,int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("I am in constructor 1");
		count1++;
		count++;
	}
	
	void disp1()
	{
		System.out.println(count);
		System.out.println(count1);
	}
	
	
}


public class Static1 
{
	public static void main(String[] args)
	{
		
	 	//System.out.println("hi");
		Partha p = new Partha();
		Partha p1 = new Partha(2);
		Partha p2 = new Partha(2,4);
		
		p.disp1();
		 

		
		
	}

}
