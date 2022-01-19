package com.para;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;


public class Fb extends BaseClass {
	
@Parameters({"userName","userPas"})
@Test
	private void test1(String name,@Optional("jai")String pass1) {
		getDriver();
		loadUrl1("https://www.facebook.com/");
		maximize();
		WebElement txtuser = findElementById("email");
		
		type(txtuser,name);
		WebElement txtpass = findElementById("pass");
	
		type(txtpass,pass1);
	}
}