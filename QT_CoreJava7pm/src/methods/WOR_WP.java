package methods;

public class WOR_WP 
{
	public static void Addition(int a,int b)  
	{
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	
	public static void main(String[] args) {
		
		WOR_WP worwp=new WOR_WP();
		worwp.Addition(10, 20);
		worwp.Addition(20, 30);
	}
}
