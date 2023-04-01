class Var
{
	public void disp(int... x)
	{
		System.out.println("I am in Var-Arags method :: ");
	}
	public void disp(int x)
	{
		System.out.println("I am in int method :: ");
	}
	public void disp(int x,int y)
	{
		System.out.println("I am in secodn int method :: ");
	}
}


public class VarArgs {

	public static void main(String... args) 
	{
		Var v = new Var();
		
		v.disp();
		v.disp(1,2,6);
		v.disp(3);
		v.disp(3,2);
	}

}
