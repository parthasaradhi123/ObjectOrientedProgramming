class Var1
{
	public void m1(int[]... x)
	{
		for(int[] a:x)
		{
			 
			for(int ele:a)
			{
				System.out.println(ele);
			}
		}
	}
}
public class Vargs {

	public static void main(String[] args) 
	{
		int[] x = {10,20,30};
		int[] y = {10,20};
		
		Var1 v = new Var1();
		
		v.m1(x,y);

	}

}
