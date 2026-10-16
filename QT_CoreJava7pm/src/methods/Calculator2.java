package methods;

public class Calculator2 
{
	//Same Package and Different Class 
	//Inside Package and Outside Class
	//+ - * /
	
	private void Substraction()
	{
		int a=20,b=10;
		int c=a-b;
		System.out.println("Substraction:"+c);
	}
	
	static void Division() //default 
	{
		int a=20,b=10;
		int c=a/b;
		System.out.println("Division:"+c);
	}


	public static void main(String[] args) {
		Calculator1 cal1=new Calculator1();
		Calculator2 cal2=new Calculator2();
		cal1.Addition();  //Public 
		cal2.Substraction();
		cal1.Multification(); //Protected
		Calculator2.Division();
		//Calculator1.Substraction(); //The method Substraction() from the type Calculator1 is not visible
		
		
		
	}
	

}
