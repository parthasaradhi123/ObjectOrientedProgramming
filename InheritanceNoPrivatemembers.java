class Demo143
{
	private String name;
	 
	void disp()
	{
		System.out.println("Parent1");
	}
}

class Child1 extends Demo143
{
	void disp1()
	{
	//	name = "partha"; // visibility error because private members of a class cannot participate in inheritance
		                    // in order to preserve encapsulation.
	}
}





public class InheritanceNoPrivatemembers
{

	public static void main(String[] args) 
	{
 
	}

}
