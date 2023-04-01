class  Partha1
{
	protected void cry()
	{
		System.out.println("parent is crying");
	}
}

 class Chill extends Partha1
 { 
	 public void cry()
	 {
		 System.out.println("child 1 cries at low voice");
	 }
 }
 class Child1 extends Partha1
 {
	 public void cry()
	 {
		 System.out.println("child 2 cries at high voice ");
	 }
 }
public class Polymorpishm {

	public static void main(String[] args) 
	{
		Chill c = new Chill(); // Tight Coupling:- Object is refering to the object type
	
		Partha1 p = new Chill(); // But Loose Coupling :- We create an object for the child but the refernce type is 
		                         // of Parent then in such case we call it as Tight coupling and polymorphism can be achived.
		
		
		Child1 c1 = new Child1();
		
		Partha1 p1 = new Child1();
		
		Partha1 f;
		f = c;
		
		f = c1;
		
		p.cry();
		p1.cry();
		
		//Partha1 p = new Partha1();
		
		
		
		

	}

}
