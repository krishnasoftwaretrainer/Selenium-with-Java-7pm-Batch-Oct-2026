package controlflow;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		for(int i=1;i<=200;i++)
		{
			System.out.println(i+".Thank You");
		} */
		
		//Print 10 to 1 Values
		/*
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		} */
		
		//Print Even Numbers b/w 2 to 20
		/*
		for(int i=2;i<=20;i+=2) //2<=20True
		{
			System.out.println(i);
		}
		*/
		//Print Odd Numbers b/w 1 to 20
		
		for(int i=1;i<=10;i++)
		{
		System.out.println("Enter your age here:");
		int age=scan.nextInt();
		
		if(age>=18 && age<=80)
		{
			System.out.println("Eligible to apply vote");
		}
		else
		{
			System.out.println("Not Eligible to apply vote");
		}
		System.out.println(i);
		}
	}

}
