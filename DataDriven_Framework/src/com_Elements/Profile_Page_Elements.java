package com_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com_Setup.Launch_Browser;

public class Profile_Page_Elements extends Launch_Browser {
	
	@FindBy(xpath = "//a[@href='#profile']")
	public static WebElement myprofile;

	@FindBy(xpath = "//*[@id=\"profilefrm\"]/div/div/div[2]/div[2]/div/input")
	public static WebElement pww;
	
	
	@FindBy(name="confirmpassword")
	public static WebElement confirmpw;
	
	@FindBy(name="address1")
	public static WebElement a1;
	
	@FindBy(name="address2")
	public static WebElement a2;
	
	@FindBy(name="city")
	public static WebElement city;
	
	
	@FindBy(name="state")
	public static WebElement st;
	
	@FindBy(name="zip")
	public static WebElement zipcode;
	
	@FindBy(name="phone")
	public static WebElement phnno;
	
	@FindBy(xpath = "//*[@id=\"profilefrm\"]/div/div/div[4]/div[2]/div/div[2]/div/div/input")
	public static WebElement dropdown;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submitbtn;
	
}
