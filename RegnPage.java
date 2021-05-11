package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.pages.common.BasePage;

public class RegnPage extends BasePage {
	//WebDriver driver;
	
	public RegnPage(WebDriver driver)
	{
		super(driver);
		System.out.println("Constructor......");
	}
	/*@FindBy(how=How.CLASS_NAME,using="ico-register") WebElement regLink;
	public void gotoRegnPage() {
		
		regLink.click();
		
	}*/
	@FindBy(how=How.ID,using="gender-male") WebElement genderOption;
	@FindBy(how=How.ID,using="FirstName") WebElement firstName;
	@FindBy(how=How.ID,using="LastName") WebElement lastName;
	@FindBy(how=How.NAME,using="DateOfBirthDay") WebElement dob;
	@FindBy(how=How.NAME,using="DateOfBirthMonth") WebElement birthMonth;
	@FindBy(how=How.NAME,using="DateOfBirthYear") WebElement yearofBirth;
	@FindBy(how=How.ID,using="Email") WebElement email;
	public void enterPersonalDetails()
	
	{
		genderOption.click();
		firstName.sendKeys("Swapna");
		lastName.sendKeys("Balachandran");
		
		Select s=new Select(dob);
		s.selectByValue("8");
		Select s2=new Select(birthMonth);
		s2.selectByValue("2");
		Select s3=new Select(yearofBirth);
		s3.selectByValue("1990");
		email.sendKeys("abc@gmail.com");
	}
    @FindBy(how=How.ID,using="Company") WebElement compName;
	public void enterOrgDetails()
	{
		compName.sendKeys("IBM");
	}
	@FindBy(how=How.ID,using="Password") WebElement pwd;
	@FindBy(how=How.ID,using="ConfirmPassword") WebElement confPwd;
	@FindBy(how=How.ID,using="register-button") WebElement regButton;
	public void enterPWD_Submit()
	{
		pwd.sendKeys("123");
		confPwd.sendKeys("123");
		regButton.click();
	}
}
