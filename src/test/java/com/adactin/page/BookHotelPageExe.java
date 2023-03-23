package com.adactin.page;

import org.openqa.selenium.WebElement;


import com.adactin.baseClass.BaseClass;
import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.SearchHotelLocators;

public class BookHotelPageExe extends SelectHotelPageExe {
	public static WebElement firstname()
	{
		BaseClass.textBox(BaseClass.findElementByid(BookHotelLocators.firstname),excelRead("adactin",4,5));
		return element;
	}

	public static WebElement lastname()
	{
		BaseClass.textBox(BaseClass.findElementByid(BookHotelLocators.lastname),excelRead("adactin",6,5));
		return element;
	}
	public static WebElement address()
	{
		BaseClass.textBox(BaseClass.findElementByid(BookHotelLocators.address),excelRead("adactin",8,5));
		return element;
	}
	public static WebElement cc_num()
	{
		BaseClass.textBox(BaseClass.findElementByid(BookHotelLocators.cc_num),excelRead("adactin",10,5));
		return element;
	}
	public static WebElement cc_type()
	{
		BaseClass.findElementByid(BookHotelLocators.cc_type);
		return element;
	}
	
	public static WebElement ccdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(BookHotelLocators.cc_type), 2);
		return element;
	}
	public static WebElement cc_exp_month()
	{
		BaseClass.findElementByid(BookHotelLocators.cc_exp_month);
		return element;
	}
	public static WebElement expdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(BookHotelLocators.cc_exp_month), 8);
		return element;
	}
	
	public static WebElement cc_exp_year()
	{
		BaseClass.findElementByid(BookHotelLocators.cc_exp_year);
		return element;
	}
	public static WebElement yeardown() {
		BaseClass.selectIndex(BaseClass.findElementByid(BookHotelLocators.cc_exp_year), 4);
		return element;
	}
	public static WebElement cc_cvv()
	{
		BaseClass.textBox(BaseClass.findElementByid(BookHotelLocators.cc_cvv),excelRead("adactin",18,5));
		return element;
	}
	
	
	public static WebElement book_now()
	{
		BaseClass.click(BaseClass.findElementByid(BookHotelLocators.book_now));
		return element;
	}
	
	
	public static WebElement logout()
	{
		BaseClass.click(BaseClass.findElementByid(BookHotelLocators.logout));
		return element;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
