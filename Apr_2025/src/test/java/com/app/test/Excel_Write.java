package com.app.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	
	public static void main(String[] args) {
		excel_modify();
	}
	public static void excel_write() {
	
		try {
			File f= new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct"
					+ "\\one\\Apr_2025\\src\\test\\resources\\TestData\\Excel_Apr.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook();
			Sheet sheet = wb.createSheet("Aiite");
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("Java");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void excel_modify() {
		
		try {
			File f= new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct"
					+ "\\one\\Apr_2025\\src\\test\\resources\\TestData\\Excel_Apr.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Aiite");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			System.out.println(cell);
			if(cell.getStringCellValue().equals("Java"))
			cell.setCellValue("Selenium");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
