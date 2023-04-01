class Saradhi
{
	float add(float a , int b)
	{
		return a+b;
	}
	float add(int c, float a)
	{
		return c+a;
	}
//	int add(int a, int b)
//	{
//		return a+b;
//	}
}







public class CodeSnippet {

	public static void main(String[] args)
	{
	
		Saradhi s = new Saradhi();
		// s.add(10, 20); // here both the methods have the capacity to store the values but complier is
		                         // ambigous and through ce

	}

}
