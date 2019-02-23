package com.flip.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.flip.qa.Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(how=How.XPATH, using ="//div[contains(@class,'_1jA3uo')]//div[@class='_1jcwFN _3dmQRh']//div[@class='_2aUbKa']") WebElement conatc_number;
	@FindBy(how=How.XPATH, using ="//div[contains(@class,'_1jA3uo')]//div[@class='_1jcwFN _3dmQRh']//div[@class='_2aUbKa']") WebElement conatctlink;
	@FindBy(how=How.XPATH, using ="//div[contains(@class,'_1jA3uo')]//div[@class='_1jcwFN _3dmQRh']//div[@class='_2aUbKa']") WebElement dellink;
	@FindBy(how=How.XPATH, using="//input[@class='_2zrpKA _3v41xv']") public   WebElement conatctLink;


public void Homepage(){
	
}
public void verfiyCurrentuser(){
	
}
public ConatctPage clickonConatacLink(){
	conatctlink.click();
	return new ConatctPage();
}
public  DealPage clickOnDealPage(){
	dellink.click();
	return new DealPage();
}
//when create new conatctthen we need action
public void clickonNewConatct(){
	Actions act=new Actions(driver);
	  act.moveToElement(conatctLink).build().perform();// yaha jo parameter hoga wah conatct link se aayega.
}
}