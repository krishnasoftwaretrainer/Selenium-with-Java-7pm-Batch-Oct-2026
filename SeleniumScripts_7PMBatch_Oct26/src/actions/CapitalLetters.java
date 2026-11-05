package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//Scroll Page 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement textare1=driver.findElement(By.id("ta1"));
		WebElement textarea2=driver.findElement(By.xpath("//textarea[@cols=\"30\"]"));
		//textare1.sendKeys("FDGSDGSG");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		
//		action.keyDown(Keys.SHIFT).sendKeys(textare1, "abcdefgh").keyUp(Keys.SHIFT).build().perform();
//		Thread.sleep(1000);
//		
//		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		action.keyDown(Keys.CONTROL).sendKeys(textarea2, "v").keyUp(Keys.CONTROL).build().perform();
	
		action.keyDown(textarea2, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		action.keyDown(textare1, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.BACK_SPACE).perform();
	}
	

}
