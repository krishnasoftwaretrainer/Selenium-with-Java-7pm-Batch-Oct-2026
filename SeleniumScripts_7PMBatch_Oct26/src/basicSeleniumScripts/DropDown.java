package basicSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		
		Select sel=new Select(monthdropdown);
		Thread.sleep(2000);
		//sel.selectByIndex(3);
		//sel.selectByValue("August");
		//sel.selectByVisibleText("December");
		sel.selectByContainsVisibleText("Decemb");
	}

}
