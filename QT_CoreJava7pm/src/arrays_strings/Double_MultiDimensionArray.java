package arrays_strings;

import java.util.Scanner;

public class Double_MultiDimensionArray {

	public static void main(String[] args) {
		/*
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}}; 
		//R0:C0 C1 C2 R1:C0 C1 C2 R2 
		//R0CO R0C1 R0C2  R1C0 R1C1 R1C2  R2C0 R2C1 R2C2
		//SIZE:3x3=9
		
		for(int i=0;i<3;i++) //Rows
		{
			for(int j=0;j<3;j++) //Columns 
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}  */
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][2];
		System.out.println("Enter array elements");
		
		for(int i=0;i<a.length;i++) //Rows
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Given Array");
		for(int i=0;i<a.length;i++) //Rows
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
