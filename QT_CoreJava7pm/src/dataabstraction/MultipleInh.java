package dataabstraction;

interface Parent1
{
	public void Father1();
}
interface Parent2
{
	public void Father2();
}
public class MultipleInh implements Parent1,Parent2
{
	public void Father1()
	{
		System.out.println("Father1");
	}
	public void Father2()
	{
		System.out.println("Father2");
	}
	
	public static void main(String[] args) {
		MultipleInh mul=new MultipleInh();
		mul.Father1();
		mul.Father2();
	}
}
