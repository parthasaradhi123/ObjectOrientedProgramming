import java.util.*;

class Farmer
{
	
	private static float ri;
	
	private float pa;    // pa means principle amount.
	private float td;    // td means time duration.
	private float si;    // si means simple intrest.
//	private float ri;    // ri means rate of intrest.
	
	static
	{
		ri = 2.5f;
	}


	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kinly enter the principle amount : ");
		pa = sc.nextFloat();
		
		System.out.println("Kindly mention the time duration : ");
		td = sc.nextFloat();
		
				
	}
	
	void compute()
	{
		si = (pa*td*ri)/100;
	}
	void disp()
	{
		System.out.println("The SI is : "+si);
	}

}


public class EncapsulationLoan {

	public static void main(String[] args) 
	{
		Farmer f = new Farmer();
		Farmer f1 = new Farmer();
		
		f.input();
		f.compute();
		f.disp();
		
		System.out.println();
		
		f1.input();
		f1.compute();
		f1.disp();
		 
		
	}

}
