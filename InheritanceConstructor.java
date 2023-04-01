 class Parentt
 {
	 int a,b;
	 
	 Parentt()
	 {
		 super();
		 a = 10;
		 b = 20;
		 System.out.println("parentt  cost");
	 }
	 Parentt(int a, int b)
	 {
		 super();
		 this.a =a;
		 this.b = b;
		 
		 System.out.println(" 2 Parentt par cost");
	 }
 }
 
 class Childd extends Parentt
 {
	 int x,y;
	 
	 public Childd()
	 {
		 this(111,222); //now it will call the parent class constructor that is Parentt() constructor.
		 x =100;
		 y =200;
		 
	 }
	 public Childd(int x, int y)
	 {
		 super(x,y);
		 this.x = x;
		 this.y = y;
		 
	 }
	 
	 void disp()
	 {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(x);
		 System.out.println(y);
		 
	 }
	 
 }






public class InheritanceConstructor 
{

	public static void main(String[] args)
	{
		Childd ch = new Childd();
		
		ch.disp();
		
		System.out.println();
		
		Childd ch1 = new Childd(1000,2000);
		
		ch1.disp();
				
				
	}

}
