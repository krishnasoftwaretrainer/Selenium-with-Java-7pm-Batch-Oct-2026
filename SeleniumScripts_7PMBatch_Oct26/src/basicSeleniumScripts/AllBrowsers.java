package basicSeleniumScripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers {

	public static void main(String[] args) 
	{
		//WebDriver driver=new EdgeDriver(); //Polymorphism 
		WebDriver driver=new FirefoxDriver(); 
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

	}

}
