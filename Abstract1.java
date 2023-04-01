abstract class Loan1
{
	abstract public void dispInt();
	public void welcome()
	{
		System.out.println("Welcome to the XXX Bank  ");
	}
}

class HomeLoan extends Loan1
{
	public  void dispInt()
	{
		System.out.println("RI is 12%");
	}
}

class EducationLoan extends Loan1
{
	public  void dispInt()
	{
		System.out.println("RI is 10%");
	}
}




public class Abstract1 {

	public static void main(String[] args) 
	{
		Loan1 l  = new HomeLoan();
		l.welcome();
		l.dispInt();
		
		
		Loan1 l1 = new EducationLoan();
		l1.welcome();
		l1.dispInt();
		
	}

}
