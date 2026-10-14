package arrays_strings;

import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		/*
		int htno[]= {101,102,103,104,105,106};
		//for(int i=0;i<5;i++)
		for(int i=0;i<htno.length;i++)
		{
		System.out.println(htno[i]); //MR SC or SR MC
		//System.out.print(htno[i]+"  "); //MR SC or SR MC
		//ArrayIndexOutOfBoundsException
	} */
		
		//Memory allocation for dynamic array
		//datatype arrryvaribale[]=new datatype[Size];
		
		System.out.println("Enter arrays size:");
		int asize=scan.nextInt();
		//int htno[]=new int[5];
		
		int htno[]=new int[asize];
		System.out.println("Enter array values:");
		
		for(int i=0;i<htno.length;i++)
		{
			htno[i]=scan.nextInt();

		}
	System.out.println("Given array is");
		for(int i=0;i<htno.length;i++)
		{
		System.out.println(htno[i]); //MR SC or SR MC
		}
	}

}
