class Display
{
	void disp()
	{
		System.out.println("Ineuron");
	}
	void disp(String name)
	{
		System.out.println(name);
	}
	void disp(int age)
	{
		System.out.println(age);
	}
}




public class Mog {

	public static void main(String[] args) 
	{
		 Display d = new Display();
		 
		 d.disp();
		 d.disp(25);
		 d.disp("Partha");
		 

	}

}
