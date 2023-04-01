
public class Wrapper {

	public static void main(String[] args) 
	{
		Integer i = 10;
		Integer b = 10;
		@SuppressWarnings("removal")
		Integer a = new Integer(10);
		
		System.out.println(i == a);
		
		System.out.println(b == i);
		
		//To convert a Primitive data into Object use the below valueOf Method
		
		Integer c = Integer.valueOf(20);
		Byte b1 = Byte.valueOf("-20");
		Short s = Short.valueOf((short)1000);
		Long l = Long.valueOf(10000); 
		Float f = Float.valueOf(20.6f);
		Double d = Double.valueOf(200.5);
		Short s1 = 1000;
		
		Character c1 = Character.valueOf('h');
		
		char ch = c1;
		
		System.out.println(c1);
		System.out.println(ch);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(s1);
		
		System.out.println("==============================================================");
		
		// To convert a Wrapper object into primitive use xxxValue() method or AutoUnBoxing.
		
		Integer x = 10;
	//	int x1 = x; // direct conversion that is AutoUnboxing
		int x1 = x.intValue(); // Normal intValue Conversions.
		
		Float y = 12.5f;
	//	float y1 = y.floatValue();
		float f1 = y;
		Character u = 'A';
//		char u1 = u.charValue();
		int u2 = u;
	     char u1 = u;
	     
	     Byte bo = 126;
	     byte bo1 = bo;
	     byte bo2 = bo.byteValue();
	     
	     System.out.println(x1);
	     System.out.println(f1);
	     System.out.println(u1);
	     System.out.println(bo1);
	     System.out.println(bo2);
	     System.out.println(u2);
		 System.out.println("==================================");
		
		String s2 = "20";
		
		Integer i1 = Integer.valueOf(s2);
		Float f2 = Float.valueOf(s2);
		
		System.out.println(i1);
		System.out.println(i1+10);
		System.out.println(f2);
		
		String s3 = String.valueOf(10);
		System.out.println(s3= s3+100);
		
	  //In order to convert a string into primitive type we use parseXXX
		System.out.println("=========================================");
		
		int i20 = Integer.parseInt(s3);
		System.out.println(i20-10000);
		float f40 = Float.parseFloat(s3);
		
		double f41 = Double.parseDouble(s3);
		
		System.out.println(f40);
		System.out.println(f41);
		
		
		
		
		
		
	}

}
