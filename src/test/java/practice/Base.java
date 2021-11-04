package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	static WebDriver driver;
   public static void initialization() 
   {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://opensource-demo.orangehrmlive.com/");
      
   }
   public static void takeScreenShot(String metdName) throws IOException
   {
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("C:\\Users\\z00467ka\\Desktop\\selenium screenshot\\"+metdName+".png"));
   }
   
}
