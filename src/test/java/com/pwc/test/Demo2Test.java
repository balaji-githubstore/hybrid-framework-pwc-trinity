package com.pwc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("data/TestData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet= book.getSheet("invalidCredentialTest");
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		DataFormatter format=new DataFormatter();
		
		String[][] main=new String[rowCount-1][cellCount];
		
		for(int r=1;r<rowCount;r++)
		{
			for(int c=0;c<cellCount;c++)
			{	
				String cellValue=format.formatCellValue(sheet.getRow(r).getCell(c));
				main[r-1][c]=cellValue;
			}
		}
		
		System.out.println(main);
		System.out.println(main[0][0]);
	}

}




