package basicSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators 
{
	static WebDriver driver;
	public static void Locators1() throws InterruptedException 
	{
		driver = new ChromeDriver(); // Polymorphism
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String ExceptedURL = "https://www.saucedemo.com/";
		String ActualURL = driver.getCurrentUrl();
		if (ExceptedURL.equals(ActualURL)) {
			// driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.tagName("input")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			// driver.findElement(By.tagName("input")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			// driver.findElement(By.className("submit-button btn_action")).click();
			// driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
			driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
			Thread.sleep(2000);
			if (driver.getCurrentUrl().contains("inventory.html")) {
				System.out.println("Login Success");
			}

		} else {
			System.out.println("Test Case is Fail");
		}

		
		driver.close();

	}
	public static void Locators2()
	{
		driver = new ChromeDriver(); // Polymorphism
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Forgotten password?")).click();
	//driver.findElement(By.partialLinkText("Forgotten")).click();
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		//WebLocators.Locators1();
		WebLocators.Locators2();
	}

}
