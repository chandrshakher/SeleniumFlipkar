package com.flip.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flip.qa.Base.TestBase;

public class Testutil extends TestBase{

  public static long PAGE_LOAD_TIMEOUT=20;
  public  static long IMPLICIT_WAIT=10;
  public static String testdata_stringpath="E://Yadav Selenium//CSYadavProjectwebdrive//FlipkartTest//src//main//java//com//flip//qa//testdata//DataProvider.xls";
  
  public static void switchToFrame(){
	  //driver.switchTo().frame("");
	  TestBase.initializatio().switchTo().frame(0);
	  
  }
 public static Object[][] getTesData(String sheetname){
	   FileInputStream fis=null;
	   try{
	   fis=new FileInputStream(testdata_stringpath); 
	   }
	   catch(FileNotFoundException e){
		   e.printStackTrace();
	   }try{
	     WorkbookFactory.create(fis);
	   }
	   catch (Exception e){
		   
	   }
	   Object [][] data=new Object[4][3];
	   return data;
  }
 public void tackeScreenshotAtendtoTest(){
	 TakesScreenshot take=(TakesScreenshot)driver;
     File srcFile=  take.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(srcFile,new File( "E:\\Yadav Selenium\\CSYadavProjectwebdrive\\POMFlipCart\\Screenshot\\yadav.jpeg ") );
	
 }

}
