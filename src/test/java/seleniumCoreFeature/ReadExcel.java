package seleniumCoreFeature;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel 
{

	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		FileInputStream fis =new FileInputStream("C:\\Users\\z00467ka\\Desktop\\Zeppelin\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		int rowCount=s.getLastRowNum()+1;
		System.out.println(rowCount);
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);
		System.out.println(c.getStringCellValue());	
		
	}

}
