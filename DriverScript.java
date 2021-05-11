package com.testutil;

import java.io.IOException;

public class DriverScript {
	
	/*static FuncLib_XLS fl;

	public static void main(String[] args) throws IOException {
		
		fl=new FuncLib_XLS("D:\\Selenium_Training\\downloads\\workspace\\Framework2021\\src\\com\\testutil\\TestSuite.xlsx");
          System.out.println(isRunMode(fl,"TC1"));
	}*/
	public static boolean isRunMode(FuncLib_XLS f, String tcName) throws IOException {
		for(int rno=2;rno<f.getRowCount("TestCases");rno++) {
			if(f.getCellValue("TestCases", rno, 1).equals(tcName))
			{
				if(f.getCellValue("TestCases", rno, 3).equals("Y"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
		}
		return false;
		
	}

}
