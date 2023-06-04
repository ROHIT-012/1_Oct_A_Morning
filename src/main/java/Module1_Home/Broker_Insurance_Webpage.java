 package Module1_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Broker_Insurance_Webpage
{
	
		//POM-II
		
	    @FindBy (xpath="//h4[text()='Ash12@gmail.com']") WebElement Signedinas;  //private WebElement Signedinas=driver.findElement(By.xpath("//h4[text()='Ash12@gmail.com']"));
		                                                                                           
	    @FindBy (xpath="//input[@value='Log out']") WebElement Logoutbtn;    //private WebElement Logoutbtn=driver.findElement(By.xpath("//input[@value='Log out']"));
		
		
	  //2.Initialize within a Constructor with Access level Public using a PageFactory
	    
	    public Broker_Insurance_Webpage (WebDriver driver)
	    {
	    
	    	PageFactory.initElements(driver, this);
	    	
	    	
	    }
	    
	    //3.Utilize Within method with Access level Public
	    
	    public String getEmail()
	    {
	    	String ActualEmailAddress=Signedinas.getText();
	    	
	    	return ActualEmailAddress;
	    	   	
	    }
	    
	    public void ClickLogoutBtn() 
    	{
    		Logoutbtn.click();
    	}
    	
   	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
