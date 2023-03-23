package demoqa;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DemoqaExe extends DemoqaLocators {


	public void form()
	{
		BaseClass.click(BaseClass.findElementByxpath(forms));
		
		}
public static void FirstName(String srt)
{
	BaseClass.textBox(BaseClass.findElementByid(DemoqaLocators.FirstName), srt);
}

public static void LastName(String s)
{
	BaseClass.textBox(BaseClass.findElementByid(DemoqaLocators.LastName), s);
}
public static void Email(String E)
{
	BaseClass.textBox(BaseClass.findElementByid(DemoqaLocators.Email), E);
}

public void gender()
{
	BaseClass.click(BaseClass.findElementByxpath(gender));
	}

public static void mobileNumber(String m)
{
	BaseClass.textBox(BaseClass.findElementByid(DemoqaLocators.mobileNumber), m);
}
public static void currentAddress(String c)
{
	BaseClass.textBox(BaseClass.findElementByid(DemoqaLocators.CurrentAddress), c);
}



public static void city(String t) throws AWTException
{
BaseClass.click(BaseClass.findElementByid(city));
BaseClass.textBox(BaseClass.findElementByid(DemoqaLocators.city),t);
element.sendKeys(t,Keys.ENTER);
}

//public static void subject(String sub)
//{
//	BaseClass.textBox(BaseClass.findElementByxpath(DemoqaLocators.subjects), sub);
//}

public void hobbies()
{
	BaseClass.click(BaseClass.findElementByxpath(hobbies));
	}

//public static void submit()
//{
//	implicitlyWait();
//BaseClass.click(BaseClass.findElementByid(submit));
//}

//BaseClass.textBox(BaseClass.findElementByxpath(DemoqaLocators.city), sr);

//	BaseClass.Action(BaseClass.findElementByxpath(city));
	
//	BaseClass.doubleClick(BaseClass.findElementByxpath(city));
//	BaseClass.click(BaseClass.findElementByxpath(city));
	
	
//	BaseClass.dropdown("Haryana").click();
	}


//	public static void cityName(String sr)
//{
//	BaseClass.textBox(BaseClass.findElementByxpath(DemoqaLocators.cityName), sr);
//}

//}
