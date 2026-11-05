package basicSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {
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
		
		driver.close();
	}

}
