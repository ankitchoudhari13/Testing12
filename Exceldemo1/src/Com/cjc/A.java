package Com.cjc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	
	public static void main(String[] args) throws Exception  {
		
	
FileInputStream in=new FileInputStream("F:\\Fill\\Book1.xlsx");
	
	//workbook load
	XSSFWorkbook book= new XSSFWorkbook(in);
	
	//sheet
	XSSFSheet sheet1=book.getSheet("Sheet1");
	//row 1
		XSSFRow row1=sheet1.getRow(1);
		
		//cell 1
		XSSFCell c1=row1.getCell(0);
		
		String usern=c1.getStringCellValue();
		 
		//cell 2
		XSSFCell c2=row1.getCell(1);
		
		String pass1=c2.getStringCellValue();
		
		
		System.out.println("USERNAME ="+usern);
		System.out.println("PASSWORD ="+ pass1);
		

		sheet1.getRow(1).createCell(2).setCellValue("FAIL CASE");
		
		FileOutputStream fo=new FileOutputStream("F:\\Fill\\Book1.xlsx");
		
		book.write(fo);
		
		System.out.println("write sucessfully");
	
	
	
	
	
	
	
	
	
	
	
}
}


