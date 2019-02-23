package com.flip.qa.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.flip.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(how=How.LINK_TEXT, using="Login & Signup")@CacheLookup private   WebElement login_button;
	@FindBy(how=How.CSS, using="input._2zrpKA[type=text]") private   WebElement username_ele;
	@FindBy(how=How.XPATH, using="//input[@class='_2zrpKA _3v41xv']") private   WebElement password_ele;
	@FindBy(how=How.XPATH, using="//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']") private  WebElement submit_Button;
	@FindBy(how=How.XPATH, using ="//img[contains(@class,'_1e_EAo')") private WebElement flipImage;
	    
	/*public LoginPage(){
		PageFactory.initElements(TestBase.initializatio(), this);
	}*/
	// Action:
  /* public  String validateLoginPageTile(){
	    return TestBase.initializatio().getTitle();
	   
   }*/
 /* public   boolean validateFlipImage(){
	  return flipImage.isDisplayed();
   }	*/
   
   public void login(String un, String pwd) throws InterruptedException{
	 // login_button.click();
	   username_ele.sendKeys(un);
	   password_ele.sendKeys(pwd);
	   Thread.sleep(2000);
	   submit_Button.click();
	   return ;
   }
}
