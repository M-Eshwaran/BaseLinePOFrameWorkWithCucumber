package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import importSheet.ReadExcel;

public class BaseUtils {
	//public String excelFileName;
	public static ChromeDriver driver;

	//@Parameters({"url"})
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	/*@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		
		return ReadExcel.getExcelData(excelFileName); 
		
	}*/
}

