package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Tests.TestBase;

public class Loginpage extends TestBase {
	
	
	public Loginpage(){
	}
		@FindBy(linkText = "LOGIN") WebElement LOGIN;
		@FindBy(name = "login") WebElement login;
		@FindBy(name = "password") WebElement password;
		@FindBy(name = "Submit") WebElement Submit;
		
		public void Login() throws InterruptedException{;
		LOGIN.click();
		Thread.sleep(6000);
		
		}
		
		public void LOGIN(){;
		login.sendKeys("shiva");
		
				
		}
		
		public void PASSWORD(){;
		password.sendKeys("sunmoon");
				
		}
		
		public void SUBMIT(){;
		Submit.click();
				
		}
		
		public void verifytitlepage() {
			
		}
	}


