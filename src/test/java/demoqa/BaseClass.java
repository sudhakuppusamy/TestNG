package demoqa;

import java.awt.AWTException; 
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions ac;
    public static JavascriptExecutor js;
	public static Select s;
	public static Alert alert;
	public static WebElement element;
	
	public  static WebDriver setProperty() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasanth_Home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  return driver;
			}

	public static void getUrl(String url) {
		driver.get(url);
			
		}
		public static void window() {
			driver.manage().window().maximize();
			
		}

	public static WebElement findElement(By by) {
		 element =driver.findElement(by);
		return element;
	}
	public static WebElement findElementByid(String id) {
		element= driver.findElement(By.id(id));
		return element;
	}

	public static WebElement findElementByname(String name) {
		element=driver.findElement(By.name(name));
		return element;
	}

	public static void textBox(WebElement webElement, String data) { 
		 element.sendKeys(data);
	}
	
	public static WebElement click(WebElement webelement) { 
		element.click();
		return element;
		
	}

	public static WebElement findElementByclassName(String classsname) {
		element= driver.findElement(By.className(classsname));
		return element;
	}

	public static WebElement findElementByxpath(String xpathvalue) {
		element= driver.findElement(By.xpath(xpathvalue));
		return element;
	}

	public static WebElement findElementBycssSelector(String cssselectvalue) {
		element= driver.findElement(By.cssSelector(cssselectvalue));
		return element;
	}

	public static WebElement findElementBylinkTest(String LinkTextValue) {
		element= driver.findElement(By.linkText(LinkTextValue));
		return element;
	}

	public static WebElement findElementBypartialLinkText(String partialLinkTextvalue) {
		element= driver.findElement(By.partialLinkText(partialLinkTextvalue));
		return element;
	}

//	public static WebElement dropdown(String howTo, String value ) {
//		Select st=new Select(element);
//		switch (howTo) {
//		case "index":
//			st.selectByIndex(Integer.parseInt(value));
//			break;
//		case "value":	
//			st.selectByValue(value);
//			break;
//		case "text":
//			st.selectByVisibleText(value);
//			break;
//			default:
//				System.out.println("no dropdown");
//				break;
//		}
//		return element;
		
		
	
	public static WebElement dropdown(String drop) {
		Select st=new Select(element);
		st.selectByVisibleText(drop);
		return element;
		
	}
	public static void selectIndex(WebElement element,int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
		
	}
	public static void Action(WebElement element) {
		Actions action = new Actions(driver);

		action.moveToElement(element).click().perform();}
		
	
	public static void doubleClick(WebElement element) {
		Actions action = new Actions(driver);

		action.moveToElement(element).doubleClick().perform();}
	

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public static WebElement ExplicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-3-input")))).sendKeys("NCR");
		
		return element;
//		(driver.findElement)(By.xpath("//div[contains(text(),'Select State')]"))
	}

	public static String attribute(String id) {
		WebElement orderNo = driver.findElement(By.id("order_no"));
		return orderNo.getAttribute("value");

	}

	public static String readProp(String key) {
		String value = null;
		try {
			FileReader read = new FileReader("C:\\Users\\Vasanth_Home\\eclipse-workspace\\pagefactory\\src\\test\\resources\\DataProperty");
		Properties prop = new Properties();
		prop.load(read);
		value = prop.getProperty(key);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

public static String excelRead(String sheet, int r, int c) {
	String value = null;
	try {
		String filePath = "C:\\Users\\Vasanth_Home\\eclipse-workspace\\Hotel\\src\\test\\resources\\TestData\\Book.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(sheet);

		Row row = sh.getRow(r);

		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			value = cell.getStringCellValue();

		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date cellDateValue = cell.getDateCellValue();
				SimpleDateFormat sc = new SimpleDateFormat("dd-MM-YYYY");
				value = sc.format(cellDateValue);

			} else {
				double numValue = cell.getNumericCellValue();
				long l = (long) numValue;
				value = String.valueOf(l);
				return value;
			}
		}

	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return value;

}

public static void excelWrite(String sheetName, int r, int c, String value) {

	try {
		String filePath = "C:\\Users\\Vasanth_Home\\eclipse-workspace\\Hotel\\src\\test\\resources\\TestData\\Book.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet(sheetName);
		Row createRow = createSheet.createRow(r);
		Cell createCell = createRow.createCell(c);
		createCell.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();

	}

	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
public static Object[][] excelreadalldataformat() throws IOException {
	Object value=null;
	Object[][] twoDimArray=null;		
		File f = new File("C:\\Users\\Vasanth_Home\\eclipse-workspace\\TestNG\\src\\test\\resources\\Array.xlsx");
		FileInputStream fis = new FileInputStream(f);		
		Workbook wb = new XSSFWorkbook(fis);			
		Sheet sheet = wb.getSheet("Sheet1");			
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		int physicalNumberOfCells=sheet.getRow(0).getPhysicalNumberOfCells();
		twoDimArray=new Object[physicalNumberOfRows-1][physicalNumberOfCells];
		for (int i = 1; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);					
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);					
				int cellType = cell.getCellType();
				if (cellType == 1) 
				{
					value = cell.getStringCellValue();						
				} 
				else if (cellType == 0) 
				{
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
						value = s.format(dateCellValue);							
					} else {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						value=String.valueOf(l);							
					}						
				}		
				System.out.println(value);
				twoDimArray[i-1][j]=value;					
			}
			
			for(int p=0;p<twoDimArray.length;p++)
			{
				for(int q=0;q<twoDimArray[p].length;q++)
				{
					//System.out.print(twoDimArray[p][q]);
					
				}
				//System.out.println();
			}

		}
		return twoDimArray;
}
	
public static void main(String[] args) {

}






public static void text(Object sendKeys, String t) {
	// TODO Auto-generated method stub
	
}


	// TODO Auto-generated method stub
	
}



