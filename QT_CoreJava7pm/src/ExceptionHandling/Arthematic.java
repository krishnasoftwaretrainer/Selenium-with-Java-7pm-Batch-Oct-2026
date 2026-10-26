package ExceptionHandling;

public class Arthematic {

	public static void main(String[] args) 
	{
//		System.out.println("Program Start");
//		System.out.println(5/0);
//		System.out.println("Division Success");
		//ArithmeticException
		
		try
		{
		System.out.println("Program Start");
		System.out.println(5/0);
		//System.out.println("Division Success");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
			System.out.println("Division Success");
		}
	}

}
