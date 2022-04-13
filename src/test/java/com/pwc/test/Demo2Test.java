package com.pwc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("data/TestData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidCredentialTest");
		
		String cellValue=sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println(cellValue);
		
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println(r);
				System.out.println(c);
				System.out.println("----------------");
			}
		}
		
	}

}




