class Student3
{
	private String name;
	private int age;
	private String city;
	
	
	public Student3(String name,int age, String city)
	{
		this("saradhi"); // this method will call the constructor that is present in the present class.
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public Student3(String name) // Constructor overloading
	{
		super(); // It will call the parent constructor of the present class
		this.name = name;
	}
	public Student3()
	{
		super();
		 
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
	
}
public class Encapuslation4 {

	public static void main(String[] args) 
	{
		 
		Student3 s = new Student3("Partha");
		
		String s1 = s.getName();
		System.out.println(s1);
	
		Student3 st = new Student3("Partha",25,"kadapa");
		
		String s2 = st.getName();
		int x = st.getAge();
		String s3 = st.getCity();
		
		System.out.println();
		
		System.out.println(s2);
		System.out.println(x);
		System.out.println(s3);

		
	}

}
