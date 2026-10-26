package ExceptionHandling;

public class Checked {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("One");
		Thread.sleep(2000); //Checked 
		System.out.println("Two");
		Thread.sleep(2000);
		System.out.println("Three");
	}

}
