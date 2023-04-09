package For_Practice_Maven_Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Data_Read_Ex3 {

	
	@Test
	public void Excel_Data_Loop() throws IOException
	{
		File ExcelFile = new File("C:\\Users\\User\\Desktop\\ExcelSheet\\Book3.xlsx");
		FileInputStream fis = new FileInputStream (ExcelFile);
		
		XSSFWorkbook wk2 = new XSSFWorkbook (fis);
		XSSFSheet Sheet = wk2.getSheet("Sheet1");
		XSSFRow row = Sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		
		int rownumber = Sheet.getLastRowNum();
		System.out.println(rownumber);
		
		int colnumber = row.getLastCellNum();
		System.out.println(colnumber);
		
		for (int i = 0; i< colnumber; i++)
		{
			System.out.println(colnumber);
		}
		
		
	
							   
	}
}
