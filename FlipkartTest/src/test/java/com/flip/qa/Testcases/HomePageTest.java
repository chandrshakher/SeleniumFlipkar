package com.flip.qa.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flip.qa.Base.TestBase;
import com.flip.qa.Pages.ConatctPage;
import com.flip.qa.Pages.HomePage;
import com.flip.qa.Pages.LoginPage;
import com.flip.qa.Util.Testutil;
import com.qa.ExtentReportListner.ExtentReportListnerrrr;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	ConatctPage contactpage;

	@BeforeMethod
	public void setUp() throws InterruptedException {

		loginPage = PageFactory.initElements(TestBase.initializatio(),
				LoginPage.class);
		loginPage.login(prop.getProperty("username"),
				prop.getProperty("password"));
		homepage = PageFactory.initElements(TestBase.initializatio(),
				HomePage.class);
		contactpage = PageFactory.initElements(TestBase.initializatio(),
				ConatctPage.class);
	}

	@Test
	public void verifyHomepage() {
		
		// there are so many test cases.
		Testutil.switchToFrame();// when element is not clik but xpath is
									// correct then select and right click then
									// check viewsource page it frame
		homepage.clickonConatacLink();
	}

}
