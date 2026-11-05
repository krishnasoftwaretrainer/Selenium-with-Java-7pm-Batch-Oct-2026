package basicSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabsValidLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Polymorphism
		// Thread.sleep(2000); //Hold the execution 2s
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		// driver.get("https://developer.salesforce.com/signup");
		// Smoke Testing
		String ExceptedURL = "https://www.saucedemo.com/";
		String ActualURL = driver.getCurrentUrl();

		System.out.println(ExceptedURL);
		System.out.println(ActualURL);

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
			if(driver.getCurrentUrl().contains("inventory.html"))
			{
				System.out.println("Login Success");
			}
			
		} else {
			System.out.println("Test Case is Fail");
		}

		 driver.close();

		// org.openqa.selenium.InvalidSelectorException: Compound class names not
		// permitted

		/*
		 * Open Browser[Chrome/Edge/Firefox] Maximize the Browser Enter
		 * URL:[https://www.saucedemo.com/] Enter Valid UserName[standard_user] Enter
		 * Valid Password[secret_sauce] Click on Login Button Verify the Test
		 * Result[Compare Exp vs Act] Close Browser
		 */

	}

}
