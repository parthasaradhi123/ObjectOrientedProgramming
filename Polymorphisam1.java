class Parents
{
	public void cry()
	{
		System.out.println("Parents crying ");
	}
	
	
}

class Child11 extends Parents
{
	 public void cry()
	 {
		 System.out.println(" Child1 crying ");
	 }
	 
	 public void eat()
	 {
		 System.out.println(" Child 1 eats less");
	 }
}

class Child12 extends Parents
{
	public void cry()
	 {
		 System.out.println("child2 crying ");
	 }
	 
	public void eat()
	 {
		 System.out.println(" Child 2 eats more");
	 }
}



public class Polymorphisam1 {

	public static void main(String[] args) 
	{
		Parents p = new Child11();
		p.cry();
		((Child11)p).eat();  // here we are downcasting the parent type reference to child in order to get 
		                     // the specialized methods in the child.
		
		Parents p1 = new Child12();
		p1.cry();
		((Child12)p1).eat();   // here we are downcasting the parent type reference to child in order to get 
        // the specialized methods in the child.
	}

}
