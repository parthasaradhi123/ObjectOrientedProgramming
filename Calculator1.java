class Calcy
{
	
//	int a,b,c;
//	
//	void add()
//	{
//		a = 10;
//		b = 20;
//		c = a+b;
//		System.out.println(c);

		
//		void add(int a, int b)
//		{
//			res = a+b;
//			System.out.println(res);
//		}
		
//	int a,b, res;
//	 int add()
//	 {
//		 a = 10;
//		 b= 20;
//		 res = a+b;
//		  return res;
//	 }
	int add(int a, int b)// these are called parameters
	{ 
		int res = a+b;
		return res;
		
	}
}


public class Calculator1 {

	public static void main(String[] args) 
	{
		
	    Calcy cal = new Calcy();
	   //int res  = cal.add(); // here the method is retunring something and now I want to store that value
	                       // in order to store that we use above syntax
	  int res = cal.add(15,25); // 15 and 25 are dataa arguments we have to pass some arguments
	    System.out.println(res);//here res variable name have access to only main method();
	}

}
