package com.data.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.data.test.TestExecutor;

public class ExcelRead extends TestExecutor{
	
	public void readexcel() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenNov\\TestData\\RegTestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
	int rowcount=	sheet.getLastRowNum()+1;
	
	int colcount = sheet.getRow(0).getLastCellNum();
	
	
	
	for(int i=0;i<colcount;i++)
	{
		map.put(format.formatCellValue(sheet.getRow(0).getCell(i)), format.formatCellValue(sheet.getRow(1).getCell(i)));

	}
	
	}

	
	public String getData(String key) throws IOException
	{
		readexcel();
		return (String) map.get(key);
	}
	
}
