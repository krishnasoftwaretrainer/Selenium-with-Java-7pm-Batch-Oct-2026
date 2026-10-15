package methods;

public class Calculator 
{
	 int a=22,b=33;
	
	public void Addition()  //Instance User-define methods
	{
		//a=20;b=30;
		//int a=20,b=10;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	
	public static void Substraction()
	{
		//a=5;b=2;
//		int a=20,b=10;
		int c=a-b;
		System.out.println("Substraction:"+c);
	}

	public void Mutification()
	{
//		int a=20,b=10;
		int c=a*b;
		System.out.println("Mutification:"+c);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.Addition();
		Calculator.Substraction();
		cal.Mutification();
		
		cal.Substraction();
		//Calculator.Mutification();
	}
}
