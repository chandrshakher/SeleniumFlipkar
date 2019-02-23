package com.flip.qa.Testcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flip.qa.Base.TestBase;
import com.flip.qa.Pages.LoginPage;
import com.qa.ExtentReportListner.ExtentReportListnerrrr;

public class LoginPageTest extends TestBase {

	
	   LoginPage loginPage;
	
		
		@BeforeMethod  
		public void setUp(){
			//1.initiliazing browser activities.
			// initializatio();
			loginPage=PageFactory.initElements(TestBase.initializatio(), LoginPage.class);
			// loginPage =new LoginPage();
		}
		/*@Test(priority=1)
		public void titleTest(){
			// verify tile
			String title=loginPage.validateLoginPageTile();
			Assert.assertEquals(title, "Flipkart");
			
		}
		@Test(priority=2)
		public void  logoImageTest(){
		boolean image	=loginPage.validateFlipImage();
		  Assert.assertTrue(image);
		}*/
		@Test
		public void loginTest() throws InterruptedException{
			
		/*String title=loginPage.validateLoginPageTile();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!");*/
		/*	boolean image	=loginPage.validateFlipImage();
			  Assert.assertTrue(image);*/
			// verify username and password. return home page
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
			
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
	}


