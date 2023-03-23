package com.adactin.page;

import org.openqa.selenium.WebElement;


import com.adactin.baseClass.BaseClass;
import com.adactin.locators.LoginPageLocators;
import com.adactin.locators.SearchHotelLocators;
import com.adactin.locators.SelectHotelLocators;

//import baseClass.BaseClassSel;

public class SelectHotelPageExe  extends SearchHotelPageExe{
	public static WebElement radio()
	{
		BaseClass.click(BaseClass.findElementByid(SelectHotelLocators.radio));
		return element;
	}

	public static WebElement contin()
	{
		BaseClass.click(BaseClass.findElementByid(SelectHotelLocators.contin));
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
