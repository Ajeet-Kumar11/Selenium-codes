package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest
{
	static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, IOException, InvalidFormatException 
  { 
	    String baseUrl = "http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(2000);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		String parentId=itr.next();
		String childId=itr.next();
		driver.switchTo().window(childId);
		driver.findElement(By.name("emailid")).sendKeys("ajeet");
		driver.switchTo().window(parentId);
		String tiltle=driver.getTitle();
		System.out.println(tiltle);
	 
  }
  
}
