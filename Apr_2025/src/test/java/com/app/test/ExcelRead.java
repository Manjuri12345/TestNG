package com.app.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	
	
	public static String  exread(int a , int b) {
	String value = null;
		try {
			File f = new File("");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet");
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
				
			}else if (cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)){
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value= sm.format(dateCellValue);	
				}else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					value = String.valueOf(l);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("")).sendKeys(exread(0,1));

	}

}
