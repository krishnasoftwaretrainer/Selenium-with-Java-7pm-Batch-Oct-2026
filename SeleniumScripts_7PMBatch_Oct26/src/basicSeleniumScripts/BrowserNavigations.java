package basicSeleniumScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.google.common.io.Files;

import jodd.io.FileUtil;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--headless");
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://jqueryui.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		File sc1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(sc1, new File("D:\\Selenium7pmBatch\\Screenshots\\Screenshot1.png"));
		
		driver.navigate().back();
		Thread.sleep(2000);
		File sc2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(sc2, new File("D:\\Selenium7pmBatch\\Screenshots\\Screenshot2.png"));
		
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		File sc3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(sc3, new File("D:\\Selenium7pmBatch\\Screenshots\\Screenshot3.png"));
		
		System.out.println("Success");
		driver.close();
	}

}
