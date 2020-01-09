package Tests;

	import java.io.IOException;
	import java.util.concurrent.TimeUnit;	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;

import cucumber.api.java.After;
import cucumber.api.java.Before;
	 
	public class TestBase {
	 
	 public static WebDriver driver =null;
	 
	 
	 public static  void initialize() throws IOException{
	 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sruthi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 //To maximize browser
	                driver.manage().window().maximize();
	         //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //To open facebook
	                driver.get("http://www.webloadmpstore.com/");
	 
	 }
	 
	 
	 //Test cleanup
	 public void TeardownTest()
	    {
		 driver.close();
	        
	    }
	 
	}