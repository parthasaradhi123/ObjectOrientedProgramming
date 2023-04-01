class Student1
{
	private String name;
	private String city;
	private int age;
	
	public Student1(String name, String city, int age) // constructor which have same name as class name no return type
	                                                   //we can use it instead of setters.
	{
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}
	public int getAge()
	{
		return age;
	}
}


public class Encapsulation3 {

	public static void main(String[] args)
	{
		Student1 s = new Student1("Partha","Kadapa",24);
		
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getAge());
		
		
	}

}
