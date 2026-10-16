package methods;

public class WR_WOP 
{
	public int Add()
	{
		int a=20,b=20;
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		WR_WOP wrwop=new WR_WOP();
		//System.out.println(wrwop.Add());
		int result=wrwop.Add();
		System.out.println(result);
	}

}
