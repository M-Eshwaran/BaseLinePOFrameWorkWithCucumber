package pages;

import utils.BaseUtils;


public class myLeadsPage extends BaseUtils{
	
	public myLeadsPage() {
		
	}
	public createLeadPage clickMyLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		return new createLeadPage();
}
	
	

}
