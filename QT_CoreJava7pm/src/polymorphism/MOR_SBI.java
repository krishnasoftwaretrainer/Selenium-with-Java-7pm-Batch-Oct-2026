package polymorphism;

public class MOR_SBI extends MOR_RBI
{
	public void RateOfIntrest()
	{
		System.out.println("SBI RateOfIntrest: 6%");
	}
	
	public static void main(String[] args) {
		MOR_SBI sb=new MOR_SBI();
		sb.RateOfIntrest();
	}


}
