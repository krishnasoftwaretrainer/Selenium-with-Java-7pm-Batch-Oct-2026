package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions 
{
	WebDriver driver;
	public void mouseclicks() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement dbclick=driver.findElement(By.id("doubleClickBtn"));
		WebElement rtclick=driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.doubleClick(dbclick).perform();
		Thread.sleep(2000);
		action.contextClick(rtclick).build().perform();
		
	}
	
	public void dragdrop() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		
		Actions action=new Actions(driver);
		//action.dragAndDrop(dragme, drophere).perform();
		action.dragAndDropBy(dragme, 0, 50).perform();
	}
	public static void main(String[] args) throws InterruptedException {
		mouseactions mouse=new mouseactions();
		//mouse.mouseclicks();
		mouse.dragdrop();
	}

}
