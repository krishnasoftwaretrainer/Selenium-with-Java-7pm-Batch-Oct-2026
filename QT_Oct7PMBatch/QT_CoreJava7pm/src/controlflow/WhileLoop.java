package controlflow;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		/*
		while(true)
		{
			System.out.println("Thank You");
		}*/
		
		//Print 1 to 10 Numbers
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		} */
		
		while(true)
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
		}

	}

}
