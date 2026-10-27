package basicSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class URL_Title_Verification {

	public static void main(String[] args) {
		/*
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options); //Polymorphism 
		//Thread.sleep(2000); //Hold the execution 2s
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		//driver.get("https://developer.salesforce.com/signup");
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
		
		driver.close();  */
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--headless");
		WebDriver driver=new EdgeDriver(options); //Polymorphism 
		//Thread.sleep(2000); //Hold the execution 2s
		driver.manage().window().maximize()
		//Thread.sleep(2000);
		//driver.get("https://www.saucedemo.com/");
		driver.get("https://developer.salesforce.com/signup");
		//Smoke Testing 
		String ExceptedTitle="Swag Labs";
		String ActualTile=driver.getTitle();
		
		System.out.println(ExceptedTitle);
		System.out.println(ActualTile);
		
		if(ExceptedTitle.equals(ActualTile))
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
