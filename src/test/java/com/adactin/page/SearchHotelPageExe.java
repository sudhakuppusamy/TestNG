 package com.adactin.page;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.adactin.baseClass.BaseClass;
import com.adactin.locators.LoginPageLocators;
import com.adactin.locators.SearchHotelLocators;
import com.adactin.locators.SelectHotelLocators;




public class SearchHotelPageExe extends LoginPageExe {
//	public static WebElement down;
	public static WebElement location()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.loctaion), excelRead("adactin",1,2));
		return element;
	}

	public static WebElement down() {
		BaseClass.selectIndex(BaseClass.findElementByid(SearchHotelLocators.loctaion), 1);
		return element;
	}
	
	public static WebElement Hotels()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.hotels), excelRead("adactin",9,1));
		return element;
	}
	public static WebElement Hotelsdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(SearchHotelLocators.hotels), 1);
		return element;
	}
	
	public static WebElement RoomType()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.roomType),excelRead("adactin",11,1));
		return element;
	}
	public static WebElement roomdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(SearchHotelLocators.roomType), 2);
		return element;
	}
	
	public static WebElement NumberofRooms()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.numberofRooms),excelRead("adactin",13,1));
		return element;
	}
	
	public static WebElement numdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(SearchHotelLocators.numberofRooms), 4);
		return element;
	}
	public static WebElement Checkin()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.checkin),excelRead("adactin",13,2));
		return element;
	}
	
	public static WebElement Checkout()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.checkout),excelRead("adactin",14,2));
		return element;
	}
	public static WebElement AdultsperRoom()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.adultsperRoom),excelRead("adactin",15,1));
		return element;
	}
	
	public static WebElement adultdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(SearchHotelLocators.adultsperRoom), 2);
		return element;
	}
	
	public static WebElement ChildrenperRoom()
	{
		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.childrenperRoom),excelRead("adactin",16,1));
		return element;
	}
	public static WebElement childdown() {
		BaseClass.selectIndex(BaseClass.findElementByid(SearchHotelLocators.childrenperRoom), 2);
		return element;
	}
	
	public static WebElement search()
	{
		BaseClass.click(BaseClass.findElementByid(SearchHotelLocators.search));
		return element;
	}
	
//	public static WebDriver driver;
//	public static Actions ac;
//    public static JavascriptExecutor js;
//	public static Select s;
//	public static Alert alert;
//	public static WebElement element;
//
//	  
//	public static WebElement location()
//	{
//		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.Loctaion), excelRead("adactin",1,2));
//		return element;
//	}
//
//	
//	public static WebElement Hotels()
//	{
//		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.Hotels), excelRead("adactin",9,1));
//		s.selectByVisibleText("Hotel Sunshine");
//		return element;
//	}
//	
//	public static WebElement RoomType()
//	{
//		BaseClass.textBox(BaseClass.findElementByid(SearchHotelLocators.RoomType),excelRead("adactin",12,1));
////		Select s=new Select(element);
////		s.selectByVisibleText("Hotel Sunshine");
//		return element;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
