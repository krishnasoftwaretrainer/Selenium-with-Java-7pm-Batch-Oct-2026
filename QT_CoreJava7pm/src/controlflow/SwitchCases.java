package controlflow;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any two values:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("CALCULATOR");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIFICATION");
		System.out.println("4.DIVISION");
		
		System.out.println("Choose your option");
		String option=scan.next().toLowerCase();
		switch(option)
		{
		case "addition":
		//case 'A':
		{
			int sum=a+b;
			System.out.println("Addition:"+sum);
			break;
		}
		case "substraction":
		{			
		int sub=a-b;
		System.out.println("Substraction:"+sub);
		break;
		}
		case "multification":
		{
			int mul=a*b;
			System.out.println("Multification:"+mul);
			break;
		}
		case "division":
		{
			int div=a/b;
			System.out.println("Division:"+div);
			break;
		}
		default :
		{
			System.out.println("Choose option either \nAddition \nSubstraction \nMultification \nDivision");
		}
		}

		
		/*
		System.out.println("Choose your option");
		//int option=scan.nextInt();
		String option=scan.next();
		switch(option)
		{
		case 1:
		{
			int sum=a+b;
			System.out.println("Addition:"+sum);
			break;
		}
		case 2:
		{			
		int sub=a-b;
		System.out.println("Substraction:"+sub);
		break;
		}
		case 3:
		{
			int mul=a*b;
			System.out.println("Multification:"+mul);
			break;
		}
		case 4:
		{
			int div=a/b;
			System.out.println("Division:"+div);
			break;
		}
		default :
		{
			System.out.println("Choose option b/w 1 to 4 only");
		}
		}  */
	}
	}


