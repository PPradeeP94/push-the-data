package com.Data_Driven;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Read_Data_Driven {

	public static void singleData() throws IOException {

		File f = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Excel_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(4); // yadav
		Cell cell = row.getCell(1); // 321

		CellType type = cell.getCellType();
		if (type.equals(type.STRING)) {
			String value = cell.getStringCellValue();
	//		System.out.println(value);
		} else if (type.equals(type.NUMERIC)) {
			double numvalue = cell.getNumericCellValue();
			int value = (int) numvalue;
	//		System.out.println(value);
		}
	}

	public static void allData() throws IOException {
		File f = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Excel_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();

				if (type.equals(type.STRING)) {
					String value = cell.getStringCellValue();
		//			System.out.println(value);
				} else if (type.equals(type.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue;
		//			System.out.println(value);
				}
			}
		}
	}
	public static void particularRow() throws IOException {
		File f = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Excel_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(0);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType type = cell.getCellType();
			
				if (type.equals(type.STRING)) {
				String value = cell.getStringCellValue();
	//			System.out.println(value);
				
			} else if (type.equals(type.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
	//			System.out.println(value);
			}	
		}	
	}
	public static void particularColumn() throws IOException {
		
		File f = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Excel_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
	//		Cell cell = row.getCell(0);
			Cell cell = row.getCell(2);
			CellType type = cell.getCellType();
					
				if (type.equals(type.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
				}
			 else if (type.equals(type.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
			}
		}
	public static void main(String[] args) throws IOException {
		
		singleData();
		allData();
	//	System.out.println("Particular");
		particularRow();
	//	System.out.println("column");
		particularColumn();
	}

}
