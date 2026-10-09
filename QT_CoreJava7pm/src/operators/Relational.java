package operators;

import java.util.Scanner;

public class Relational 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any value");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println(a>b); //false
		System.out.println(a>=b); //false
		
		System.out.println(a<b); //true
		System.out.println(a<=b); //true
		
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
	}

}
