package com.pwc.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static String[][] getSheetIntoTwoDimArray(String path,String sheetname) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet= book.getSheet(sheetname);
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
		
		return main;
	}

}
