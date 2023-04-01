class Plane
{
	public void takeOff() //Inherited methiods
	{
		System.out.println("The plane is taking off : ");
	}

	public void fly()
	{
		System.out.println("The plane is flying : ");
	}
	
	public void landing()
	{
		System.out.println("The plane is landing :");
	}
}

class CargoPlane extends Plane
{
	public void fly()  //Overiden method
	{
		System.out.println("The cargoPlane flys at lower height : ");
	}
	
	public void carryGoods() //Specialized method.
	{
		System.out.println("The CargoPlane carries the goods.");
	}
	//The above three methods are present here also but you cannot see with your eyes.
}

class PassangerPlane extends Plane
{
	public void fly()  //Overiden method
	{
		System.out.println("The PassangerPlane flys are very high height : ");
	}
	
	public void carryPassanger() //specialized method
	{
		System.out.println("passangerplane carries passangers : ");
	}
	
	// takeOff(), landing() inhertied methods.
}


class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("Fighter plane flys at higher highs : ");
	}
}


class Airport
{
	public void permit(Plane pl)
	{
		pl.takeOff();   // This  is real runtime polymorphism 
		pl.fly();       // we have written all these methods only once but will be executed three time for all the
		                // three classes.
		pl.landing();
		
	}
}

public  class Uml {

	public static void main(String[] args) 
	{
		PassangerPlane pp = new PassangerPlane();
		CargoPlane cp = new CargoPlane();
		Airport a = new Airport();
		FighterPlane fp = new FighterPlane();
		
		
		a.permit(pp);
		a.permit(cp);
		a.permit(fp);
//		
//		Plane pl;
//		
//		pl = cp;
//		pl.takeOff();  //  1:M one line doing multiple task
//		pl.landing();
//		pl.fly();
//		
//		pl = pp;
//		
//		pl = cp;
//		pl.takeOff();  //   1:M one line doing multiple task
//		pl.landing();
//		pl.fly();
		
		
		
		
		
		
		
		
		
		
//		cp.takeOff(); // inherited method
//		cp.carryGoods(); //specialized method
//		cp.fly(); //overriding method
//		cp.landing();// inherited method
		
	 

	}

}
