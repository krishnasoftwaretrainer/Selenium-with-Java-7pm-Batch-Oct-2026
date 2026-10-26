package ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		//String name="Krishna";
		//String name=null;
		//System.out.println(name.length());
	
		try
		{
			String name=null;
			System.out.println(name.length());
			//System.out.println("Program success");

		}
		catch(NullPointerException np)
		{
			System.out.println(np.getMessage());
			System.out.println(np);
			System.out.println("Exception Handled Successfully");
			//System.out.println("Program success");
		}
		
		finally
		{
			System.out.println("Program success");
		}
	}

}
