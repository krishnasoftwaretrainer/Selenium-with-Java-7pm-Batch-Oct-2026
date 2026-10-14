package arrays_strings;

import java.util.Scanner;

public class Arrays_ArthematicOperations {

	public static void main(String[] args) {
		// + - * /
		//c=a+b
		//c[][]=a[][]+b[][];
		
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][2];
		int b[][]=new int[3][2];
		int c[][]=new int[3][2];
		
		System.out.println("Enter first array elements");
		
		for(int i=0;i<a.length;i++) //Rows
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter second array elements");
		
		for(int i=0;i<b.length;i++) //Rows
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Addition of given two arrays:");
		
		for(int i=0;i<c.length;i++) //Rows
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
