package pages;

import utils.BaseUtils;

public class myHomePage extends BaseUtils{
	
	public myHomePage() {
		
	}
	
	public myLeadsPage clickLead() {
		
		driver.findElementByLinkText("Leads").click();
		return new myLeadsPage();
}
	
	
}
