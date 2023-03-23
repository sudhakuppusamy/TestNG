package com.adactin.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwoDArray {
	
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
	try
	{		
		excelreadalldataformat();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}


//	public static String excelreadreusable(int i, int j) {
//		String value = null;
//		try {
//		
//			File f = new File("C:\\Users\\Vasanth_Home\\eclipse-workspace\\TestNG\\src\\test\\resources\\Array.xlsx");
//		
//			FileInputStream fis = new FileInputStream(f);
//			
//			Workbook wb = new XSSFWorkbook(fis);
//		
//			Sheet sheet = wb.getSheet("Sheet1");
//			Row row = sheet.getRow(i);
//			Cell cell = row.getCell(j);
//			// System.out.println(cell);
//			// cellType();
//			int cellType = cell.getCellType();
//			if (cellType == 1) {
//				value = cell.getStringCellValue();
//				System.out.println(value);
//
//			} else if (cellType == 0) {
//				if (DateUtil.isCellDateFormatted(cell)) {
//					Date dateCellValue = cell.getDateCellValue();
//					SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
//					value = s.format(dateCellValue);
//					System.out.println(value);
//				} else {
//					double numericCellValue = cell.getNumericCellValue();
//					long l = (long) numericCellValue;
//					value = String.valueOf(l);
//					System.out.println(value);
//				}
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return value;
//	}



	
//	public static String excelRead(int r, int c) {
//		String value = null;
//		try {
//			String filePath = "C:\\Users\\Vasanth_Home\\eclipse-workspace\\TestNG\\src\\test\\resources\\Array.xlsx";
//			File file = new File(filePath);
//			FileInputStream fis = new FileInputStream(file);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sh = wb.getSheet("Sheet1");
//
//			Row row = sh.getRow(r);
//
//			Cell cell = row.getCell(c);
//			int cellType = cell.getCellType();
//			if (cellType == 1) {
//				value = cell.getStringCellValue();
//
//			} else if (cellType == 0) {
//				if (DateUtil.isCellDateFormatted(cell)) {
//					Date cellDateValue = cell.getDateCellValue();
//					SimpleDateFormat sc = new SimpleDateFormat("dd-MM-YYYY");
//					value = sc.format(cellDateValue);
//
//				} else {
//					double numValue = cell.getNumericCellValue();
//					long l = (long) numValue;
//					value = String.valueOf(l);
//					return value;
//				}
//			}
//
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		return value;
//
//	}

//	public static void excelWrite(String sheetName, int r, int c, String value) {
//
//		try {
//			String filePath = "C:\\Users\\Vasanth_Home\\eclipse-workspace\\TestNG\\src\\test\\resources\\Array.xlsx";
//			File file = new File(filePath);
//			FileInputStream fis = new FileInputStream(file);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet createSheet = wb.createSheet(sheetName);
//			Row createRow = createSheet.createRow(r);
//			Cell createCell = createRow.createCell(c);
//			createCell.setCellValue(value);
//
//			FileOutputStream fos = new FileOutputStream(file);
//			wb.write(fos);
//			wb.close();
//
//		}
//
//		catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}

//	public static void main(String[] args) throws IOException {
//		TwoDArray v = new TwoDArray();
//		v.excelreadalldataformat(1,1);

		

}