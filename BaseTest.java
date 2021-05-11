package com.testcases.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public void init() throws IOException {
		Properties p=new Properties();
		FileInputStream f1=new FileInputStream("D:\\Selenium_Training\\downloads\\workspace\\Framework2021\\src\\com\\Config\\Config.properties");
		p.load(f1);
        //System.out.println(p.getProperty("URL"));
        //System.out.println(p.getProperty("UID"));
        //System.out.println(p.getProperty("PWD"));
        

		if(p.getProperty("browsername").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium_Training\\downloads\\workspace\\Framework2021\\src\\driverfiles\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
		}//else if (p.getProperty("browsername").equals("Mozilla"))
		//{
		//	System.setProperty("webdriver.gecko.driver", "D:\\Selenium-Project\\Abhishek_Project\\Dloads\\Browserdrivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		//	driver=new FirefoxDriver();
		//}else if (p.getProperty("browsername").equals("IE"))
		//{
			//agsdgdsagsgd
			//System.setProperty("webdriver.ie.driver", "");
		//}
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium-Project\\Abhishek_Project\\Dloads\\Browserdrivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		 // driver.get(p.getProperty("URL"));
		  //driver.findElement(By.id("email")).sendKeys(p.getProperty("UID"));
		  //driver.findElement(By.id("pass")).sendKeys(p.getProperty("PWD"));
	}
	
	public void quit() {
		driver.quit();
	}

}
