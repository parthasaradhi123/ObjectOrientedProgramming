class Demo // extends Object.
// super class, parent class, base class

// By default the parent for any un specified  or not extended class is Object class.
// Object class  is an inbuilt class

{
	String name = "Partha";
	int age = 28;
	
	void disp()
	{
		System.out.println("Demo : "+name+" "+age);
	}

}

class Demo2 extends Demo // we can achive inheritance in jave using extends keyword in java
{
	// here Demo2 is parent of Demo3
	
	// Demo2 is child class, derived class, sub class
	
	void disp2()
	{
		System.out.println(" I am in  class demo2 menthod disp2");
	}
}

class Demo3 extends Demo2 // Demo3 is child of Demo2
{
	
}

public class Inhertance {

	public static void main(String[] args) 
	{
		Demo3 d = new Demo3();
		
		d.disp2();
		d.disp();
	}

}
