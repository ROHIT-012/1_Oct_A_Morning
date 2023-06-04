package Module1_Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_login 
{
	//POM-I
	
		//1. Data members/Global variables should be declared globally with access level private by using @findby Anotations
		
		
		  @FindBy (xpath="//input[@id='email']" )  private  WebElement Email;     //private WebElement Email=driver.findElement(By.Xpath("//input[@id='email']"))
	     
		  @FindBy (xpath="//input[@id='password']" ) private  WebElement Password; // private WebElement Password=driver.findElement(By.Xpath("//input[@id='password']"))
	     
		  @FindBy (xpath="//input[@class='btn btn-default']" ) private  WebElement LoginBtn;  // private WebElement LoginBtn=driver.findElement(By.Xpath("//input[@class='btn btn-default']"))

		
		//2.Initialize within a Constructor with Access level Public using a PageFactory
		  
		 public Insurance_login(WebDriver driver)
		  {
			
			  PageFactory.initElements(driver, this);
			  
		  }
		 
		 //3.Utilize Within method with Access level Public
		 
		 public void EnterEmail(String EmailAddress)
		 {
		   Email.sendKeys(EmailAddress);	 
		 }
		 
		 public void Enterpass(String Pass)
		 {
			Password.sendKeys(Pass); 
		 }
		  
		 
		 public void ClickLoginBtn()
		 {
			LoginBtn.click(); 
		 }
}
