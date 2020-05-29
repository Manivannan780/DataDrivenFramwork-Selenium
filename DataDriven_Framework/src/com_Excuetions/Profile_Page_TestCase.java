package com_Excuetions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com_Elements.Profile_Page_Elements;
import com_Setup.Launch_Browser;

public class Profile_Page_TestCase extends Launch_Browser{

	@Test
	public static void profilepage() {
		
		PageFactory.initElements(driver, Profile_Page_Elements.class);
		
		Profile_Page_Elements.myprofile.click();
		
		Profile_Page_Elements.pww.sendKeys("demouser");
		Profile_Page_Elements.confirmpw.sendKeys("demouser");
		
		Profile_Page_Elements.a1.clear();
		Profile_Page_Elements.a1.sendKeys("london");
		Profile_Page_Elements.a2.sendKeys("america");
		
		//Profile_Page_Elements.city.sendKeys("chennai");
		
		//Profile_Page_Elements.st.sendKeys("Tamilnadu");
		
		
		//Profile_Page_Elements.zipcode.clear();
		//Profile_Page_Elements.zipcode.sendKeys("4444");
		
		//Profile_Page_Elements.phnno.clear();
		//Profile_Page_Elements.phnno.sendKeys("989898");
		
		//Profile_Page_Elements.dropdown.click();
		//Profile_Page_Elements.dropdown.sendKeys("Afghanistan");
		
		Profile_Page_Elements.dropdown.click();
		Profile_Page_Elements.dropdown.sendKeys("Afghanistan");
		Select obj=new Select(Profile_Page_Elements.dropdown);
		//obj.selectByVisibleText("Afghanistan");
		
		
		Profile_Page_Elements.submitbtn.click();
		
		
	}
}
