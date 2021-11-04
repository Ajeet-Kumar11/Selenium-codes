package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.selenium.qa.ExtendReportListner.ExtendReportListner.class)
public class Zabra
{
	static WebDriver driver;
  @Test
  public void m1()
  {
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\z00467ka\\Desktop\\a1b1\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");	
      //driver = new FirefoxDriver();
	  driver=new InternetExplorerDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://opensource-demo.orangehrmlive.com/");
      driver.close();
  }
  @Test
  public void m2() 
  {
	  System.out.println(12/0);
  }
}
