package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WEBLOADHOMEPAGE {
	
	 WebDriver driver;
	 
	 public WEBLOADHOMEPAGE (WebDriver driver){ 
         this.driver=driver;        

}	 
	//Using FindBy for locating elements
	 @FindBy(how=How.XPATH, using="/html/body/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/a[1]") WebElement Demos;
	 
	 	 
	 // This method to click on Logout link
	 public void clickOnDemolink(){
		 Demos.click();
	 
	 }
	 
	
}