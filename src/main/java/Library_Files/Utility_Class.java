package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_Class
{

	//AutomationTE: @Rohit
	//Date: 29/05/2023
	//Day: MON
	//Title: Fetch data From PF
	
	@Test
	
	public static String getDataromPf(String key) throws IOException 
	{
		//To reach upto Property File
		FileInputStream file=new FileInputStream("C:\\Users\\MyPC\\eclipse-workspace\\1_Oct_A_Morning_Maven\\PropFile.properties"); 
		
		//Create Object Of properties class
		Properties prop=new Properties(); 
		
		//To open property file
		prop.load(file);
		
		//To Fetch data from PF
		 String value1 =prop.getProperty(key);    //EM   //saradeg41@gmail.com
		                                          //PSW  //Sai@1117
		
		return value1;
		//load--> Non-Static method---> Properties
	}
	
	    //AutomationTE: @Rohit
		//Date: 29/05/2023
		//Day: MON
		//Title: Fetch data From PF
	
	public static String getDatafromExcelsheet(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
	
		 FileInputStream file=new FileInputStream("C:\\Users\\MyPC\\eclipse-workspace\\1_Oct_A_Morning_Maven\\Test data\\1_Oct_A_Morning.xlsx");
		 
			Sheet Sh= WorkbookFactory.create(file).getSheet("Sheet8");
		
			String Value2=Sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return Value2;
	}
	
	
	public static void captureScreenshot(WebDriver driver, int TestCaseId) throws IOException 
	{
	
	   File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		
        File Destination=new File("C:\\Users\\MyPC\\eclipse-workspace\\1_Oct_A_Morning_Maven\\ScreenShot"+TestCaseId+".jpg");
		
		 FileHandler.copy(Source, Destination);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
