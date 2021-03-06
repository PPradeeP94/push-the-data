package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void writeOnExcel() throws IOException {
		File f = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Data_Driven\\Excel\\Excel_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		FileOutputStream fos = new FileOutputStream(f);
		Sheet sheetAt = wb.getSheetAt(0);
		Row createRow = sheetAt.createRow(7);
		Cell createCell = createRow.createCell(2);
		
		createCell.setCellValue("Hari");
		sheetAt.createRow(10).createCell(5).setCellValue(1234);
		sheetAt.getRow(7).createCell(10).setCellValue("krishna");
		wb.createSheet("Gully").createRow(5).createCell(5).setCellValue(7890);
	//	wb.removeSheetAt(1);
	
		
		
//		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		

	}
	public static void main(String[] args) throws IOException {
		writeOnExcel();
	}

}
