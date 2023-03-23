 package com.adactin.page;

import com.adactin.baseClass.BaseClass;

//import com.adactin.baseClass.BaseClassPage;
import com.adactin.locators.*;


public class LoginPageExe extends BookHotelLocators {

	public static void username(String st)
{
	BaseClass.textBox(BaseClass.findElementByid(LoginPageLocators.username), st);
	
}

public static void password(String srt)
{
	BaseClass.textBox(BaseClass.findElementByid(LoginPageLocators.password), srt);
}

public void login()
{
	BaseClass.click(BaseClass.findElementByid(LoginPageLocators.login));
	

	}
	public static void main(String[] args) {
	

	}

}

