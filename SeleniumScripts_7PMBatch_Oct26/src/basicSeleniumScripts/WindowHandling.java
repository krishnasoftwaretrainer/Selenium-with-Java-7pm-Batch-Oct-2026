package basicSeleniumScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().window().setSize(new Dimension(800,800));
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		//Thread.sleep(1000);
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
//		Thread.sleep(2000);
		
		/*String tab1handle=driver.getWindowHandle();
		System.out.println("Tab1:"+tab1handle);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://jqueryui.com/");
//		Thread.sleep(2000);
		String tab2handle=driver.getWindowHandle();
		System.out.println("Tab2:"+tab2handle);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		String tab3handle=driver.getWindowHandle();
		System.out.println("Tab2:"+tab3handle);
		
		driver.switchTo().window(tab1handle);
		Thread.sleep(2000);
		driver.switchTo().window(tab3handle);
		Thread.sleep(2000);
		driver.switchTo().window(tab2handle);
		Thread.sleep(2000);
		//driver.close(); */
		//driver.quit();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.navigate().to("https://demo.automationtesting.in/Alerts.html#Textbox");
//		System.out.println("Tab3:"+driver.getWindowHandle());
	}

}
