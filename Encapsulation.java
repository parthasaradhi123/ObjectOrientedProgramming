class Student
{
	private int age;  //data members //fields // propoerties// Instance variables
	private String name;
	private String city;
	private boolean married;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	 public boolean isMarried()
	 {
		 return married;
	 }
	
//	void setAge(int age)
//	{
//		this.age = age;
//	}
//	int getAge()
//	{
//		return age;
//	}
//	
//	void  setName(String name)
//	{
//		this.name = name;
//	}
//	String getName()
//	{
//		return name;
//	}
//	
//	void setCity(String city)
//	{
//		this.city = city;
//	}
//	String getCity()
//	{
//		return city;
//	}
	
	
}
public class Encapsulation {

	public static void main(String[] args)
	{
	 
	 Student s = new Student();
	 
	 
	 s.setCity("Kadapa");
	 String s2 = s.getCity();
	 
	 Student s3 = new Student();
	 
	 s3.setName("Saradhi");
	 System.out.println(s3.getName());
	 
	 System.out.println(s2);
		

	}

}
