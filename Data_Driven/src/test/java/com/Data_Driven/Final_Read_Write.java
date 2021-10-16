package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Final_Read_Write {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Inveterview - Copy.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value =(int)numericCellValue;
				System.out.println(value);
			}
		}
		System.out.println("hello");
		
		File f1 = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Inveterview - Copy.xlsx");
		FileInputStream fis1 = new FileInputStream(f1);
		Workbook wb1 = new XSSFWorkbook(fis1);
		Sheet sheetAt1 = wb1.getSheetAt(0);
		Row row1 = sheetAt1.getRow(1);
		Cell cell = row1.getCell(3);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value =(int)numericCellValue;
			System.out.println(value);
		}

		
		
		
		
		
		
		
	}

}
