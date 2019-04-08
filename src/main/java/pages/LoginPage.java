package pages;

import utils.BaseUtils;

public class LoginPage extends BaseUtils{
	
	public LoginPage() {
		
	}
	
	public LoginPage enterUserName() {
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	
public LoginPage enterPassword() {
		
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
public HomePage clickLogin() {
	driver.findElementById("decorativeSubmit").click();
	return new HomePage();
}
	
	

}
