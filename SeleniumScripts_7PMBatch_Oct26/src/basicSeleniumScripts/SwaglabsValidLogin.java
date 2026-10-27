package basicSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsValidLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); //Polymorphism 
		//Thread.sleep(2000); //Hold the execution 2s
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.get("https://www.saucedemo.com/");
		driver.get("https://developer.salesforce.com/signup");
		//Smoke Testing 
		String ExceptedURL="https://www.saucedemo.com/";
		String ActualURL=driver.getCurrentUrl();
		
		System.out.println(ExceptedURL);
		System.out.println(ActualURL);
		
		if(ExceptedURL.equals(ActualURL))
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
		
		driver.close();
		
		
		
		
		
	
		/*		Open Browser[Chrome/Edge/Firefox]
				Maximize the Browser
				Enter URL:[https://www.saucedemo.com/]
				Enter Valid UserName[standard_user]
				Enter Valid Password[secret_sauce]
				Click on Login Button
				Verify the Test Result[Compare Exp vs Act]
				Close Browser */

	}

}
