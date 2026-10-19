package inheritance;

public class SL_Child extends SL_Parent
{
	public void Son()
	{
		System.out.println("I have Bike");
	}
	public static void main(String[] args) {
		SL_Child c=new SL_Child();
		c.Father();
		c.Son();
	}

}
