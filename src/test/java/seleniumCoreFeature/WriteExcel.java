package seleniumCoreFeature;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel 
{

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\z00467ka\\Desktop\\Zeppelin\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.createCell(5);
		c.setCellType(c.CELL_TYPE_STRING);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\z00467ka\\Desktop\\Zeppelin\\Book1.xlsx");
		c.setCellValue("Zeppelin");
		wb.write(fos);


	}

}
