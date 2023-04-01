import java.util.*;

abstract class Shapes  // abstract classes we cannot create object for it
{
	float area;
	abstract public void input();  // abstract methods
	abstract public void compute();
	
	public void disp()
	{
		System.out.println("The area is : "+area);
	}
	Scanner sc = new Scanner(System.in);
}
class Rectanngle extends Shapes  // here we are using inheritance
{
	float length;
	float breadth;
	public void input()
	{
		
		System.out.println("Enter the length of the rectangle : ");
		length = sc.nextFloat();
		
		System.out.println("Enter the breadth of the rectangle : ");
		breadth = sc.nextFloat();
	}
	
	public void compute()
	{
		area = length*breadth;
	}
}

class Circle extends Shapes
{
	float radius;
	float pi = 3.14f;
	
	public void input()
	{
		System.out.println("Enter the value of the radius of a circle : ");
		radius = sc.nextFloat();
	}
	
	public void compute()
	{
		area = pi*(radius*radius);
	}
}

class Square extends Shapes
{
	float length;
	public void input()
	{
		System.out.println("Enter the length of the square : ");
		length = sc.nextFloat();
	}
	
	public void compute()
	{
		area =  length* length;
	}
	
}


class Abs
{
	public void poly(Shapes s)  //here we are using polymorpishm
	{
		s.input();
		s.compute();
		s.disp();
	}
}

public class InhPolyAbstr {

	public static void main(String[] args) 
	{		 
		Shapes s = new Rectanngle();
		Shapes s1 = new Circle();
		Shapes s2 = new Square();
		 
		 
		
		Abs a = new Abs();
		
		a.poly(s);
		System.out.println();
		a.poly(s1);
		System.out.println();
		a.poly(s2);
				
	}

}
