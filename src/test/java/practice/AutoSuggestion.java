package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException 
	{
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\z00467ka\\Desktop\\selenium screenshot\\a2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r =s.getRow(0);
		Cell c=r.getCell(5);
		c.setCellType(c.CELL_TYPE_STRING);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\z00467ka\\Desktop\\selenium screenshot\\a2.xlsx");
		c.setCellValue("ravi");
		wb.write(fos);
	    
	}
}
