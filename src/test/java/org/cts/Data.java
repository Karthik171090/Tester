package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sample1\\TestData\\Day11.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s= w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		System.out.println(c);
int cellType = c.getCellType();
System.out.println(cellType);
if(cellType==1) {
	String stringCellValue = c.getStringCellValue();
	System.out.println(stringCellValue);

}

		else
	{
		if(cellType==0)
		{
			if(DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				System.out.println(dateCellValue);
			}
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			Long l =(long)numericCellValue;
			String valueOf= String.valueOf(l);
			
	}


}
		
	}
}
