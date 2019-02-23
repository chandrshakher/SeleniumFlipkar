package com.flip.qa.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flip.qa.Base.TestBase;
import com.flip.qa.Pages.ConatctPage;
import com.flip.qa.Pages.HomePage;
import com.flip.qa.Pages.LoginPage;
import com.flip.qa.Util.Testutil;

public class ConatctPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	ConatctPage contactpage;
	String Sheetname="sheetname";
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		
		loginPage=PageFactory.initElements(TestBase.initializatio(), LoginPage.class);
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage=PageFactory.initElements(TestBase.initializatio(), HomePage.class);
		contactpage=PageFactory.initElements(TestBase.initializatio(), ConatctPage.class);
		homepage.clickonConatacLink();
		
	}
	// data provider using 
	@DataProvider
	public Object[][] getFliptestData(String sheetname){      // from which sheet
		Object[][] data=Testutil. getTesData(sheetname);
		return data;
	}
	
	@Test(dataProvider="getFliptestData")
	public void verifyconatc(){
		contactpage.selectConatctbyName("test user"); // test user will give from dom elenemt
		// new conatct
		homepage.clickonConatacLink();
		contactpage.createNewconatct("ss", "mr", "123", "idia", "yadav");
		
	}
}