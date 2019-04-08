package pages;

import org.openqa.selenium.WebElement;


import utils.BaseUtils;

public class viewLeadPage extends BaseUtils{
	
	public viewLeadPage() {
		
	}

	public void verifyViewLead() {
		WebElement fname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String text = fname.getText();
		if(text.equals("gopi")){
			System.out.println("veified" +text);
		}
		else {
			System.out.println("Non Found" +text);
		}
		
		
	}
	
	

}
