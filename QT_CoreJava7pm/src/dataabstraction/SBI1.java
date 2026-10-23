package dataabstraction;

interface RBI1  //Parent
{
	public void RateOfIntrest();
}
public class SBI1 implements RBI1
{
	public void RateOfIntrest()  //How 
	{
		System.out.println("SBI Rate of Intrest:6%");
	}
	
	public void Loan()
	{
		
	}
}
