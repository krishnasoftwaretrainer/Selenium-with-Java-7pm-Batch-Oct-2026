package ExceptionHandling;

public class ArrayIndex {

	public static void main(String[] args) {
		
		//ArrayIndexOutOfBoundsException
	try
	{
		int a[]= {1,2,3,4,5};
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}
		catch(ArrayIndexOutOfBoundsException aio)
		{
		System.out.println(aio);
			System.out.println("Exception Handled");
		}
	}
	
	}


