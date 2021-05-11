package com.testutil;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FuncLib_XLS {
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public String path;
	public XSSFCell cell;
	
	public FuncLib_XLS(String path) throws IOException{
		this.path=path;
		wb=new XSSFWorkbook(path);
	}
	
	public int getRowCount(String sheetname) throws IOException{
		
		sheet=wb.getSheet(sheetname);
		int r=sheet.getLastRowNum()+1;
		return r;
	}
	
	public String getCellValue(String sheetname, int rowNo, int colNo){
		sheet=wb.getSheet(sheetname);
		cell=sheet.getRow(rowNo-1).getCell(colNo-1);
		String cellvalue=String.valueOf(cell);
		return cellvalue;
	}
	
}
