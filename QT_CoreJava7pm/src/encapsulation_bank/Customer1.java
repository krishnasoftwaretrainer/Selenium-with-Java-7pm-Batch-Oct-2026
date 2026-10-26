package encapsulation_bank;

public class Customer1 
{
	private int accno=12345;
	private String accname="Krishna";
	private double balanace=1563.234;
	
	public int getaccnum()
	{
		return accno;
	}
	
	public String getaccname()
	{
		return accname;
		
	}
	
	public void setbalance(double balanace)
	{
		this.balanace=balanace;
	}
	public double getbalance()
	{
		return balanace;
		
	}
	
	public static void main(String[] args) 
	{
		Customer1 cus=new Customer1();
		System.out.println(cus.accno);
		System.out.println(cus.accname);
		System.out.println(cus.balanace);
		
	}
	

}
