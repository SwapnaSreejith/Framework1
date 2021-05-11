package com.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	MenuPage mp;
	
	public BasePage(WebDriver driver)
	{
	mp=PageFactory.initElements(driver, MenuPage.class);
	}
	
	public MenuPage getMenu()
	{
		return mp;
	}

}
