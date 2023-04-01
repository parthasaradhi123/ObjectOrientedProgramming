class Cha1
{
	public void m1(Integer i)
	{
		System.out.println("Hey");
	}
	public void m1(Float i)
	{
		System.out.println("Hey1");
	}
//	public void m1(long i)
//	{
//		System.out.println("Hey2");
//	}
	
//	public void m1(int... x)
//	{
//		System.out.println("hi");
//	}
	
}


public class VarWra {

	public static void main(String[] args) 
	{
		Cha1 v = new Cha1();
		
		int x =10; //int ==>primitive ==>TypeCasting(Widening) ==>Long,Float,Doublr
					//int ==> Autoboxing ===> Integer
		             //      if it dont find any Integer then it will search for var-args if it dont find that 
		             // also it will search for Object, NUmber;
		v.m1(x);
	}

}
