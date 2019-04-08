package pages;

import utils.BaseUtils;

public class HomePage extends BaseUtils{
	
	public HomePage() {
		
	}
	
	public myHomePage clickCrsmfa() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		return new myHomePage();
}
	
	

}
