package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Data_Read_Loop {
	
	@Test
	public void ExcelFile_Loop () throws IOException
	{
		File Excel1 = new File("C:\\Users\\User\\Desktop\\ExcelSheet\\Book3.xlsx");
		
		FileInputStream fis = new FileInputStream(Excel1);
		//load the input stream to the workbook object
		
		XSSFWorkbook wb2 = new XSSFWorkbook(fis);
		
		XSSFSheet Sheet = wb2.getSheet("Sheet1");
		
		XSSFRow row = Sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		
		int rownumber = Sheet.getLastRowNum();
		System.out.println(rownumber);
		
		int noCol=	row.getLastCellNum();
	
		System.out.println(noCol);
	
	for(int i = 0 ; i<noCol ; i++)
	{
		String ColValue = row.getCell(i).toString();
		System.out.println(ColValue);
	}
				
		/*int rowcount =  Sheet.getLastRowNum();
		System.out.println("Total Number of rows: "+rowcount);*/
		
		//column Count 
		//how to count all columns ? Ask Afzal Bhai 
		
		/*
		 * int colCount = Sheet.getRow(2).getLastCellNum();
		 * System.out.println("No of Columns: "+ colCount);
		 * 
		 * //
		 * 
		 * for (int i = 0; i < rowcount; i++) { XSSFCell CellText = Sheet.getRow()
		 * System.out.println("Cell Value: "+ CellText);
		 * 
		 * }
		 */
	}
	
	/*
	 * @Test public void testingExcel() throws IOException {
	 * ExcelFile_Loop("Sheet1", 1, 3); //ExcelFile_Loop("sheet5", 4, 1);
	 * 
	 * 
	 * }
	 */
}