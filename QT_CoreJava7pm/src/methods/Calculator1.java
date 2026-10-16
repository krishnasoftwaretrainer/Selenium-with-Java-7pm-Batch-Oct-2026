package methods;

public class Calculator1 
{
	//Same Package and Same Class 
	//[Inside Package and Inside Class]
	//+ - * 
	public void Addition()  //Instance User-define methods
	{
		int a=200,b=100;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	
	private static void Substraction()
	{
		int a=20,b=10;
		int c=a-b;
		System.out.println("Substraction:"+c);
	}

	protected void Multification()
	{
		int a=20,b=10;
		int c=a*b;
		System.out.println("Mutification:"+c);
		
	}
	public static void main(String[] args) {
		Calculator1 cal=new Calculator1();
		cal.Addition();
		Calculator1.Substraction();
		cal.Multification();
	}
}
