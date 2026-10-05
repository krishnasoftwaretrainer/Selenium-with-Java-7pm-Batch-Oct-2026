package variables_datatypes;

import java.util.Scanner;

public class Variable_declarations 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		//Syntax:datatype variablename=value;
		int a=10;
		//Re-declaration is not possible at same class level
		//int a=20;
		//Re-Initialization
		a=30; //Here a is normal variable
		System.out.println("enter second value");
		int b=scan.nextInt(); //dynamic value
		System.out.println(a+b); //The local variable b may not have been initialized
		

	}

}
