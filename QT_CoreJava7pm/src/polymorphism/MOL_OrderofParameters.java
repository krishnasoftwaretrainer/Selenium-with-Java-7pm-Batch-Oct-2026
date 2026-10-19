package polymorphism;

public class MOL_OrderofParameters {

	public void Add(int a,double b,double d)
	{
		int sum=(int)(a+b);
		System.out.println(sum);
	}
	
	public void Add(double a,int b,double d)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		MOL_OrderofParameters op=new MOL_OrderofParameters();
		op.Add(20.5, 10);
		op.Add(10, 20.5);
	}
}
