package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseUtils;

public class TC001_OverAllPages extends BaseUtils {

	/*@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}*/
	@Test//(dataProvider= "fetchData")
	public void overAllPages() {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrsmfa()
		.clickLead()
		.clickMyLead()
		.createCompanyName()
		.createFirstName()
		.createLastName()
		.clickCeateLead()
		.verifyViewLead();
		
		
	}
}
