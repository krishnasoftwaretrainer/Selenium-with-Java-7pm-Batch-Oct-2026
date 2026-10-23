package dataabstraction;

public class SBI extends RBI
{
	
	public void RateOfIntrest()  //How 
	{
		System.out.println("SBI Rate of Intrest:6%");
	}
	public void BankTimings()
	{
		System.out.println("9 to 6pm");
	}
	public static void main(String[] args) {
		SBI sb=new SBI();
		sb.RateOfIntrest();
		sb.BankTimings();
	}

}
