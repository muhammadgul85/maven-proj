package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Data_Ex1 {
	
	
	@Test
	public void testing_ExcelDataRead() throws IOException
	{
		// Can we have a method, where we only provide column name & number and print their values as currently we have to treat every row and column indiviually ?
		
		
		//you have to add Apachi POI dependency from maven repository
		File ExcelFile = new File ("C:\\Users\\User\\Desktop\\ExcelSheet\\Book3.xlsx");
		
		FileInputStream fis = new FileInputStream(ExcelFile);
		
		XSSFWorkbook wb1 = new XSSFWorkbook (fis);// to read from excel sheet 
		
		XSSFSheet s1 = wb1.getSheet("Sheet1");
		XSSFRow row = s1.getRow(2);
		XSSFCell col = row.getCell(3);
		
		XSSFRow row3 = s1.getRow(3);
		XSSFCell Col0 = row3.getCell(0);
		
		
		System.out.println(col);
		System.out.println("Row 3, Col 0 Value is : " + Col0);
		
		
		
	}
	
	

}
