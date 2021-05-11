package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.RegnPage;
import com.testcases.common.BaseTest;
import com.testutil.DriverScript;
import com.testutil.FuncLib_XLS;

public class RegTC extends BaseTest {
	//WebDriver driver;
	static FuncLib_XLS fl;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		fl=new FuncLib_XLS("D:\\Selenium_Training\\downloads\\workspace\\Framework2021\\src\\com\\testutil\\TestSuite.xlsx");
        if(DriverScript.isRunMode(fl,"RegTC"))
		init();
        else
        	throw new SkipException("Skipping the test");
	}
	@Test
	public void userRegn() throws InterruptedException
	{
		//RegnPage rp=new RegnPage();
		
		RegnPage rp=PageFactory.initElements(driver, RegnPage.class);
		//rp.gotoRegnPage();
		rp.getMenu().gotoRegnPage();
		Thread.sleep(2000);
		rp.enterPersonalDetails();
		Thread.sleep(2000);
		rp.enterOrgDetails();
		Thread.sleep(2000);
		rp.enterPWD_Submit();
	}

	
	@AfterClass
	public void closeBrowser()
	{
		quit();
		//driver.quit();
	}
}
