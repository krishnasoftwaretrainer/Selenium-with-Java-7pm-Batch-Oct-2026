package driven;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hyb_SwagLogin_TestClass {

	   POM_PageFactory_FindBy_SwagLabsLogin FindBylogin;

	    @DataProvider(name="SwagLoginAllTestData")
	    public Object[][] SwagLoginTestData() throws IOException  
	    {
	        Hyb_Read_SwagLabs_TestData_Excel_DataDriven readExcel =
	        new Hyb_Read_SwagLabs_TestData_Excel_DataDriven(
	        "D:\\Selenium\\Hybrid\\SwagTestDataMavenProject.xlsx");

	        int rowcount = readExcel.getRowCount(0);

	        Object[][] swagLoginData = new Object[rowcount-1][2];

	        for(int i=1; i<rowcount; i++)
	        {
	            swagLoginData[i-1][0] = readExcel.getExcelData(0, i, 0);

	            swagLoginData[i-1][1] = readExcel.getExcelData(0, i, 1);
	        }

	        return swagLoginData;
	    }

	    WebDriver driver;

	    Hyb_Utilty_SwagLocaters_DataDriven_Read readProp =
	    new Hyb_Utilty_SwagLocaters_DataDriven_Read();

	    @BeforeMethod
	    public void BrowserSetup() throws InterruptedException, IOException
	    {
	        readProp.ConfigReader();

	        driver = new EdgeDriver();

	        Thread.sleep(2000);

	        driver.manage().window().maximize();

	        Thread.sleep(2000);

	        driver.get(readProp.getProperty("SwagURL"));

	        Thread.sleep(2000);

	        // Initialize POM object
	        FindBylogin = new POM_PageFactory_FindBy_SwagLabsLogin(driver);
	    }


@Test(dataProvider="SwagLoginAllTestData")
public void SwagLabsLoginTest(String username, String password)
throws InterruptedException
{
    FindBylogin.loginToSwagLabs(username, password);

    Thread.sleep(2000);

    if(username.equals("standard_user") && password.equals("secret_sauce"))
    {
        String actualProductsTitle = FindBylogin.getProductsText();

        Assert.assertEquals(actualProductsTitle, "Products",
        "Login Failed: Products title mismatch");

        System.out.println("Valid Login Passed: " + actualProductsTitle);
    }
    else
    {
        String actualErrorMessage = FindBylogin.getErrorMessageText();

        Assert.assertTrue(actualErrorMessage.length() > 0,
        "Expected login error message was not displayed");

        System.out.println("Invalid Login Verified: " + actualErrorMessage);
    }
}


	    @AfterMethod
	    public void BrowserTearDown()
	    {
	        if(driver != null)
	        {
	            driver.quit();
	        }
	    }
}
