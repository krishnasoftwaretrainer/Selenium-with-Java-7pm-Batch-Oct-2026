package actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement dragme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		//action.dragAndDrop(dragme, drophere).build().perform();
	//action.dragAndDropBy(dragme, 100, 0).build().perform();
	action.clickAndHold(dragme).build().perform();
	Thread.sleep(2000);
	action.moveToElement(drophere, 0, 100).build().perform();
	//action.moveByOffset(0, 100).build().perform();
	}

}
