package testngscripts;

import org.testng.annotations.Test;

public class SampleTestNG 
{
	//@Test(priority=0,enabled=false)
	@Test(priority=0)
	public void India()
	{
		System.out.println("I am in India");
	}
	
	@Test(priority=1)
	public void Telangana()
	{
		System.out.println("I am in Telangana");
	}
	
	@Test(invocationCount=2)
	public void Hyderabad()
	{
		System.out.println("I am in Hyderabad");
	}
	
	
	
	
	
}
