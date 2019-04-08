package pages;

import utils.BaseUtils;

public class createLeadPage extends BaseUtils{
	
	public createLeadPage() {
		
	}
	
	public createLeadPage createCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
	}
	
	public createLeadPage createFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		return this;
	}
	
	public createLeadPage createLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		return this;
		
	}
	
	public viewLeadPage clickCeateLead() {
		driver.findElementByName("submitButton").click();
		return new viewLeadPage();
	}
	
		

}