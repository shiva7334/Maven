package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Tests.TestBase;


public class Homepage {
	
 public Homepage (){ 
          
}	 
	 @FindBy(linkText = "Demos")
	 public static WebElement Demos;
	 @FindBy(linkText = "Whitepapers") WebElement Whitepapers;
	 @FindBy(linkText = "Manuals") WebElement Manuals;
	 @FindBy(linkText = "Webinars") WebElement Webinars;
	 
	 	 
		 public void clickOnDemolink(){
		 Demos.click();
		 }
		 
		 public void Whitepaperslink(){
			 Whitepapers.click();
		 }	 
			 public void Manualslink(){
				 Manuals.click();		 
			 }
			 
			 public void Webinarslink(){
				 Webinars.click();		 
			 }
			 
			 
			 
	 }
