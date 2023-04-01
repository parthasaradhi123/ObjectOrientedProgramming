//jdk 1.0 ==> Method overloading or compile time polymorphishm
//jdk 1.4 ==> Any change in the no of arguments new method should be created
// but from jdk 1.5 ==> we can create single method and it can handle any no of arguments but all those
   // Arguments should be of sometype



class Chan
{
	
	public void disp(int... x)
	{

		int sum =0;
		for(int ele : x)
		{
			sum = sum+ele;
			 
		}
		System.out.print("The Total sum is :: "+ sum);
		System.out.println();
	}
//	public void add(int a,int b)
//	{
//		System.out.println(a+b);
//	}
//	public void add(int a,int b,int c)
//	{
//		System.out.println(a+b+c);
//	}
//	public void add(int a,int b,int c,int d)
//	{
//		System.out.println(a+b+c+b);
//	}
//	public void add(float a,float b)
//	{
//		System.out.println(a+b);
//	}
}




public class Demo {

	public static void main(String[] args)
	{
		Chan c = new Chan();
		
		c.disp();
		c.disp(1);
		c.disp(1,2);
		c.disp(1,2,3);
		c.disp(1,2,4,5,7,7);
	}

}
