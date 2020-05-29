package com_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com_Setup.Launch_Browser;

public  class Login_Page_Elements extends Launch_Browser  {
	
	@FindBy(name="username")
	public static WebElement un;
	
	@FindBy(name="password")
	public static WebElement pw;
	
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
	public static WebElement btn;
	

}
