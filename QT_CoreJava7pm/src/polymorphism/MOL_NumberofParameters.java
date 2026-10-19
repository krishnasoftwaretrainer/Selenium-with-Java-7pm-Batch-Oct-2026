package polymorphism;

public class MOL_NumberofParameters 
{
	public void Add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void Add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	public void Add(int a,int b,int c,int d)
	{
		int sum=a+b+c+d;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		MOL_NumberofParameters np=new MOL_NumberofParameters();
		np.Add(10, 20);
		np.Add(10, 20, 30);
		np.Add(10, 20, 30, 40);
	}
}
