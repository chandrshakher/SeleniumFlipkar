package com.flip.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.flip.qa.Base.TestBase;

public class ConatctPage extends TestBase{
	@FindBy(how=How.XPATH, using ="//div[contains(@class,'_1jA3uo')]//div[@class='_1jcwFN _3dmQRh']//div[@class='_2aUbKa']") WebElement conatc_number;

   // if tehere are multiple item 
	@FindBy(how=How.XPATH, using="//input[@class='_2zrpKA _3v41xv']") public   WebElement conatctLink;
	@FindBy(how=How.LINK_TEXT, using="Login & Signup") private   WebElement name_;
	@FindBy(how=How.CSS, using="input._2zrpKA[type=text]") private   WebElement last_name_ele;
	@FindBy(how=How.XPATH, using="//input[@class='_2zrpKA _3v41xv']") private   WebElement country_el;
	@FindBy(how=How.XPATH, using="//input[@class='_2zrpKA _3v41xv']") private   WebElement save;
	    
public void selectConatctbyName(String name){
	//driver.findElement(By.xpath("//div[contains(@class,'_1jA3uo')]//div["+name+"]"));// dyanamic click hoga
	driver.findElement(By.xpath("//div[contains(text(),'+name+']"));
}
public void createNewconatct(String titel, String Name, String number, String country,String las_name){
	Select sele=new Select(driver.findElement(By.name("title")));
	  sele.selectByValue("title");
	  name_.sendKeys(Name);
	  country_el.sendKeys(country);
	  last_name_ele.sendKeys(las_name);
	  save.click();
	  
}
}