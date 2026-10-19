package polymorphism;

public class MOL_DifferentDatatypes {

	public void Add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void Add(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		MOL_DifferentDatatypes ddt=new MOL_DifferentDatatypes();
		ddt.Add(10, 20);
		ddt.Add(10.5, 20.5);
	}
	
}
