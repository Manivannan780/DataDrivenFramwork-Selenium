package com_Excuetions;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com_Elements.Login_Page_Elements;
import com_Setup.Launch_Browser;

public class Login_TestCase_Execution extends Launch_Browser {

	
@Test
	public void testcase_login() {
		PageFactory.initElements(driver, Login_Page_Elements.class);
		String user=readpro.getProperty("username");
		String pass=readpro.getProperty("password");
		Login_Page_Elements.un.sendKeys(user);
		Login_Page_Elements.pw.sendKeys(pass);
		Login_Page_Elements.btn.click();
		
	}


}
