package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationTest {

	public void exForImplicitWait() throws InterruptedException	 
	{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
			 
			WebDriver oBrowser = new ChromeDriver(); 
			oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php"); 
			oBrowser.manage().window().maximize();		 
			oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
			
			//Thread.sleep(5000);		
			oBrowser.findElement(By.id("Loan_Amount123")).clear();		 
			oBrowser.findElement(By.id("Loan_Amount123")).sendKeys("20000");
	}
	
	public void exForExplicitWaitUsingThreadSleep() throws InterruptedException	 
	{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
			 
			WebDriver oBrowser = new ChromeDriver(); 
			oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php"); 
			oBrowser.manage().window().maximize();		 
			oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
			
			//File Upload [10KB[5 sec]- 100MB(3mins)]
			
			Thread.sleep(180000);		
			
	}
	
	@Test
	public void exForExplicitWaitUsingWebDriverWait() throws InterruptedException	 
	{
			System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
			 
			WebDriver oBrowser = new ChromeDriver(); 
			oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php"); 
			//oBrowser.manage().window().maximize();		 
			//oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
			
			//File Upload [10KB[5 sec]- 100MB(3mins)]
			WebDriverWait oWDW = new WebDriverWait(oBrowser, 20);
			oWDW.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(.,'file uploaded successfully')]")));
				
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
