package controlflow;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Student Result:A B C D Fail
		
		System.out.println("Enter student obtained marks:");
		int obtainedmarks=scan.nextInt();
		
		if(obtainedmarks>=85 && obtainedmarks<=100)
		{
			System.out.println("A Grade");
		}
		
		else if(obtainedmarks>=70 && obtainedmarks<85)
		{
			System.out.println("B Grade");
		}
		
		else if(obtainedmarks>=50 && obtainedmarks<70)
		{
			System.out.println("C Grade");
		}
		else if(obtainedmarks>=35 && obtainedmarks<50)
		{
			System.out.println("D Grade");
		}
		
		else if(obtainedmarks>=0 && obtainedmarks<35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Marks");
		
		}
		
	}

}
