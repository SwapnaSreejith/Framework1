package com.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPage {
	
	public MenuPage(WebDriver driver)
	{
		
	}
	@FindBy(how=How.CLASS_NAME,using="ico-register") WebElement regLink;
	public void gotoRegnPage() {
		
		regLink.click();
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="ico-login") WebElement loginLink;
	public void gotoLoginPage()
	{
		loginLink.click();
	}
	
	public void doLogout() {
		
	}
	
	public void doSearch() {
		
	}
	

}
