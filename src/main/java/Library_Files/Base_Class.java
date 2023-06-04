package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class 
{
	public WebDriver driver;
	
	public void InitializeBrowser()
	{
	
		//Step-I
				//Parameter-I: Name of the browser
				//Parameter-II: Path of the browser
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\MyPC\\eclipse-workspace\\1_Oct_A_Morning_Maven\\geckodriver.exe");

	           driver=new FirefoxDriver();
		
		 //To enter an URL/Open an application
		 driver.get("https://demo.guru99.com/insurance/v1/index.php");
		 
		 //Maximize Url
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
