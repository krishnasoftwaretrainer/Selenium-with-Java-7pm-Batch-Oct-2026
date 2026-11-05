package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Thread.sleep(2000);
		WebElement products=driver.findElement(By.id("products-dd-toggle"));
		Actions action=new Actions(driver);
		action.moveToElement(products).build().perform();
		Thread.sleep(2000);
		WebElement WebTesting=driver.findElement(By.id("products-dd-tab-2"));
		action.moveToElement(WebTesting).build().perform();
		Thread.sleep(2000);
		WebElement Live=driver.findElement(By.xpath("//span[text()=\"Live\"]"));
		Live.click();
		
		

	}

}
