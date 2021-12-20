package Com.cjc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","F:\\Chrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		FileInputStream in=new FileInputStream("F:\\Fill\\Book2.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(in);
		//sheet
		XSSFSheet sheet1=book.getSheet("Sheet1");
		//row 1
			XSSFRow row1=sheet1.getRow(1);
			
			//cell 1
			XSSFCell c1=row1.getCell(0);
			
			String name=c1.getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys(name);
			
         XSSFCell c2=row1.getCell(1);
			
			String name1=c2.getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys(name1);
			
			 XSSFCell c3=row1.getCell(2);
				
				String phone=c3.getStringCellValue();
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys(phone);
				
                  XSSFCell c4=row1.getCell(3);
				
				String email=c4.getStringCellValue();
				driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(email);
				
                 XSSFCell c5=row1.getCell(4);
				
				String add=c5.getStringCellValue();
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys(add);  
				
                 XSSFCell c6=row1.getCell(5);
				
				String city=c6.getStringCellValue();
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys(city);  
                   
				
				 XSSFCell c7=row1.getCell(6);
					
					String State=c7.getStringCellValue();
					driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys(State);  
                    
					 XSSFCell c8=row1.getCell(7);
						
						String post=c8.getStringCellValue();
						driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys(post);  

		
		  XSSFCell c9=row1.getCell(8);
		  
		  String username=c9.getStringCellValue();
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		  
		  
		 XSSFCell c10=row1.getCell(9);
		 
		 String password=c10.getStringCellValue(); 
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys(password);;
		  
		 XSSFCell c11=row1.getCell(10);
		 
		  String cpassword=c11.getStringCellValue(); 
		  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys(cpassword);
		
	}

}
