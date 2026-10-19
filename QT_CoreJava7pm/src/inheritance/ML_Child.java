package inheritance;

public class ML_Child extends ML_Parent 
{
	public void Son()
	{
		System.out.println("I am your Son");
	}
	
	public static void main(String[] args) {
		ML_Child ch=new ML_Child();
		ch.GP();
		ch.Father();
		ch.Son();
	}
}
