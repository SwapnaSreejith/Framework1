package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.testcases.common.BaseTest;
import com.testutil.DriverScript;
import com.testutil.FuncLib_XLS;

public class LoginTC extends BaseTest {
	//WebDriver driver;
	static FuncLib_XLS fl;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		fl=new FuncLib_XLS("D:\\Selenium_Training\\downloads\\workspace\\Framework2021\\src\\com\\testutil\\TestSuite.xlsx");
       if(DriverScript.isRunMode(fl,"LoginTC"))
		init();
       else
        	throw new SkipException("Skipping the test");
	}
	
	@Test()
	public void userLogin() throws InterruptedException {
		
		
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		//lp.gotoLoginPage();
		lp.getMenu().gotoLoginPage();
		Thread.sleep(2000);
		lp.doLogin();
		Thread.sleep(2000);
		//lp.pwd_Recovery();
		
		
	}
	
	@Test
	public void pwdRecovery() throws InterruptedException
	{
	 
		/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\downloads\\workspace\\Framework2021\\src\\driverfiles\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");*/
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		//lp.gotoLoginPage();
		lp.getMenu().gotoLoginPage();
		Thread.sleep(2000);
		//lp.doLogin();
		//Thread.sleep(2000);
		lp.pwd_Recovery();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
		quit();
	}

}
