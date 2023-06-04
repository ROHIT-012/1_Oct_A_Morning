package Module1_Home_Testclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Module1_Home.Broker_Insurance_Webpage;
import Module1_Home.Insurance_login;



public class Insurance_TestNG_Testclass extends Base_Class

{
	
	//public WebDriver driver
	//InitializeBrowser()
	
	Insurance_login Login;
	Broker_Insurance_Webpage Broker;
	
	int TestCaseId;
   @BeforeClass
	
	public void OpenBrowser() 
	{
	   InitializeBrowser();
	   
	   //Create Object of POM-I class
	    Login=new Insurance_login(driver);
	    
	   //Create Object of POM-II class
	    Broker=new Broker_Insurance_Webpage(driver);
	}
	
	@BeforeMethod
	
	public void LogintoApp() throws IOException, InterruptedException 
	{
		Login.EnterEmail(Utility_Class.getDataromPf("EM"));
		
		Login.Enterpass(Utility_Class.getDataromPf("PSW"));
		
		Thread.sleep(2000);
		
		Login.ClickLoginBtn();
	}
	
	@Test(priority=1)
	
	public void VerifyEmailAddress() throws EncryptedDocumentException, IOException
	{
		TestCaseId=100;
		String ActualEmail = Broker.getEmail();
		
	    String ExpectedEmail=Utility_Class.getDatafromExcelsheet(2, 0);
		
	    Assert.assertEquals(ActualEmail,ExpectedEmail);
	}
	
	@Test(priority=2)
	
	public void Verifytitle() throws EncryptedDocumentException, IOException
	{
		TestCaseId=101;
	   String ActualTitle=driver.getTitle();
		
		String ExpectedTitle=Utility_Class.getDatafromExcelsheet(3, 0);
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	@AfterMethod
	
	public void LogoutfromApp(ITestResult Result) throws IOException 
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			Utility_Class.captureScreenshot(driver,TestCaseId);
		}
		
		
		Broker.ClickLogoutBtn();
	}
	
	@AfterClass()
	
	public void CloseBrowser() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
