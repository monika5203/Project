package com.gnerics.MavenActitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {

	public static String getcellvalue(String path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		 String cellvalue=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}
	
	
	
	
	
}
