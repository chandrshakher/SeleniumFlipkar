package com.flip.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.flip.qa.Util.Testutil;
import com.flip.qa.Util.WebEventListner;
public class TestBase {
	
	public static WebDriver driver;
	public  static Properties prop;
	  
	 static EventFiringWebDriver  event_driver;
	
	 static WebEventListner event_lisner;
	public TestBase(){ 
		
		 try {
			 prop=new Properties();
			FileInputStream fs=new FileInputStream("E://Yadav Selenium//CSYadavProjectwebdrive//FlipkartTest//src//main//java//com//flip//qa//config//config.properties");
			    prop.load(fs);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 catch (IOException e) {
			 e.printStackTrace();
		}
		    
	}
	public static   WebDriver initializatio(){
		// we want iniziation browser property
		   
			   String browse_name= prop.getProperty("browser");
			      
			   
		   if(driver==null && browse_name.equals("chrome")){
			   System.setProperty("webdriver.chrome.driver", "C://Users//RJ//Downloads//chromedriver.exe");
			     driver=new ChromeDriver();
			     //E:\Yadav Selenium
		   }
		    
		   else if(driver==null && browse_name.equals("FF")){
			   System.setProperty("webdriver.gecko.driver", "E://Yadav Selenium//geckodriver.exe");
			     driver=new FirefoxDriver();
		   }
		   event_driver=new EventFiringWebDriver(driver);
		   //now cearte Eventlistnerhandler to resgistor with eventFireingWebdriver
		   event_lisner=new WebEventListner();
		   event_driver.register(event_lisner);
		   driver=event_driver;
		   
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 // driver.get(prop.getProperty("url"));
		   driver.navigate().to(prop.getProperty("url"));
		return driver;
	}
	/*public static void getdriver(){
		driver.navigate().to(prop.getProperty("url"));
	}*/

}
