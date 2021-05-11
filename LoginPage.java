package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.pages.common.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		System.out.println("Const.....");
	}
	/*@FindBy(how=How.CLASS_NAME,using="ico-login") WebElement loginLink;
	public void gotoLoginPage()
	{
		loginLink.click();
	}*/
	@FindBy(how=How.ID,using="Email") WebElement email;
	@FindBy(how=How.ID,using="Password") WebElement pwd;
	@FindBy(how=How.XPATH,using="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input") WebElement submitButton;
	public void doLogin()
	{
		email.sendKeys("abc@gmail.com");
		pwd.sendKeys("123");
		submitButton.click();
	}
	//@FindBy(how=How.XPATH,using="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a") WebElement pwdRecovery;
	@FindBy(how=How.LINK_TEXT,using="Forgot password?") WebElement pwdRecover;
	@FindBy(how=How.ID,using="Email") WebElement recEmail;
	@FindBy(how=How.NAME,using="send-email") WebElement pwdRecButton;
	public void pwd_Recovery()
	{
		pwdRecover.click();
		recEmail.sendKeys("abc@gmail.com");
		pwdRecButton.click();
	}

}
