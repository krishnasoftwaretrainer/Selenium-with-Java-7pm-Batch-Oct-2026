package driven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagExcelTestData {
	WebDriver driver;

    @Test(dataProvider = "testdata")
    public void DemoProject(String EmailID, String password) throws InterruptedException {
        
        driver = new ChromeDriver();

        // Setup browser
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        // Use test data from Excel
        driver.findElement(By.id("user-name")).sendKeys(EmailID);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        //Thread.sleep(3000); // Optional: For observation; replace with WebDriverWait for real testing
    }

    @AfterMethod
    public void ProgramTermination() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }

    @DataProvider(name = "testdata")
    public Object[][] TestDataFeed() throws IOException 
    {
        String excelPath = "D:\\Selenium\\SwagTestDataMavenProject.xlsx";
      
        //Object Creation
        ExcelTestData config = new ExcelTestData(excelPath);

        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows-1][2];
        
        for (int i = 1; i < rows; i++) 
        {
            credentials[i-1][0] = config.getData(0, i, 0); //int sheetNumber, int row, int column
            credentials[i-1][1] = config.getData(0, i, 1);
        }

        return credentials; 
    }

}
