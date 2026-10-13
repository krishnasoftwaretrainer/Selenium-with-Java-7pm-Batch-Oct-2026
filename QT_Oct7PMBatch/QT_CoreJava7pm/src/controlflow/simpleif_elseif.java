package controlflow;

import java.util.Scanner;

public class simpleif_elseif {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int obtainedmarks=25;
		/*
		if(obtainedmarks>=35) //55>=35T 25>=35F
			{ //Entry 
			System.out.println("Pass"); //TBS
		} //Exit 
		//Null or Blank
		/// */
		
		/*
		System.out.println("Enter student obtained marks:");
		int obtainedmarks=scan.nextInt();
		if(obtainedmarks>=35) //55>=35T 25>=35F
		{ 
		System.out.println("Pass"); //TBS
		}
		else
		{
			System.out.println("Fail");
		} */
		
		//Verify person is eligible to apply vote or not
		
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
