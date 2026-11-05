package basicSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static void BrowserConfg(String URL)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		driver.get(URL);
	}

}
