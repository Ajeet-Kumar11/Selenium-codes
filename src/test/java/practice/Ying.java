package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Ying
{

	public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException, ClassNotFoundException, SQLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/popup.php");
	    driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	    Thread.sleep(2000);
	    Set<String> st=driver.getWindowHandles();
	    Iterator<String> itr= st.iterator();
	    String ParentId=itr.next();
	    String ChildId= itr.next();
	    driver.switchTo().window(ChildId);
	    driver.findElement(By.name("emailid")).sendKeys("ajeet");
	    driver.switchTo().window(ParentId);
	    System.out.println(driver.getTitle());
	    
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://ipaddress:portnumber/Dsserver","username","password");
	    Statement smt= con.createStatement();
	    ResultSet rset = smt.executeQuery("select * from selenium user");
	    while(rset.next())
	    {
	    	String email=rset.getString("email");
	    }
	    
	   
	    
	    
	    
	     
		
	
	    	
	    


	}

}
