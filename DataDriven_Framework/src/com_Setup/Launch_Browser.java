package com_Setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Launch_Browser {

	public static Properties readpro;
	public static WebDriver driver;
	
	//Property File Reading Method
	public static Properties readfile() throws IOException {
		FileInputStream readfile=new FileInputStream("pro.properties");
		readpro=new Properties();
		readpro.load(readfile);
		return readpro;
	}



	@BeforeSuite
	//Browser launching
	public void setupbrowser() throws IOException {
		readfile();
		String linkk=readpro.getProperty("url");
		String loc=readpro.getProperty("location");
		System.setProperty("webdriver.chrome.driver",loc);
		driver= new ChromeDriver();
		driver.get(linkk);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}



	@AfterSuite
	//Browser Quit
	public void closebrowser() {
		//driver.quit();
	}
}
