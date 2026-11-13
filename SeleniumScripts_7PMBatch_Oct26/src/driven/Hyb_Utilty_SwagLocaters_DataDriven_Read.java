package driven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Hyb_Utilty_SwagLocaters_DataDriven_Read {

	Properties prop;
		    // Method to read Properties file
	    public void ConfigReader() throws IOException
	    {
	        prop = new Properties();

	        String filePath = "./src/driven/Swag_URL_Locaters_DataDriven.properties";
	        
	        try (FileInputStream file = new FileInputStream(filePath))
	        {
	            prop.load(file);
	        }
	    }

	    // Method to retrieve property value
	    public String getProperty(String key)
	    {
	        String value = prop.getProperty(key);

	        if (value == null)
	        {
	            throw new RuntimeException("Property key not found: " + key);
	        }

	        return value;
	    }

}
