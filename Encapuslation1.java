class Dog // bean class because all the data members are private
{
	private String name;
	private int cost;
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	public int getCost()
	{
		return cost;
	}
}

public class Encapuslation1 
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		
		d.setName("snoopy");
		d.setCost(20000);
		
		String s = d.getName();
		int x = d.getCost();
		
		System.out.println("The dog name is : "+s);
		System.out.println("And the cost of the dog is  : "+x);
		
		Dog d1 = new Dog();
		
		d1.setName("pluffy");
		d1.setCost(30000);
		
		String s1 = d.getName();
		int y = d.getCost();
		
		System.out.println();
		
		System.out.println("The another dog name is : "+s1);
		System.out.println("And its price is : "+y);
		
	}
}
