package controlflow;

public class NestedForLoop {

	public static void main(String[] args) {
		/*
		1	2	3	4	5
		1	2	3	4	5
		1	2	3	4	5
		1	2	3	4	5
		1	2	3	4	5      */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
//				System.out.print(j+"  ");
				//System.out.print(i+"  ");
				System.out.print(" AAA ");
			}
			System.out.println();
		} */
		/*OuterLoop:
		 * i=1;i<=5;1<=5;T
		 * InnerLoop:
		 * j=1;j<=5;1<=5:T
		 * j++;j=2;2<=5T
		 * -----------
		 * j=6;6<=5F
		 * OuterLoop:i++ i=2 2<=5T
		 * InnerLoop:
		 * j=1;j<=5;1<=5:T
		 * j++;j=2;2<=5T
		 * -------------
		 * i=6;6<=5F Exit 
		 * 
		 * 1   	2   3  	4   5
		 * 1	2	3	4	5
		 */
		
		/*
		1
		1	2
		1	2	3
		1	2	3	4
		1	2	3	4	5  */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) //1<=2 2<=2T 3<=2F
			{
				System.out.print(j+"   ");
			}
			System.out.println();
		}
	}

}
