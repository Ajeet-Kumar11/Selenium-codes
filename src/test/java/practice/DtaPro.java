package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DtaPro 
{
	static WebDriver driver;
	SoftAssert sf = new SoftAssert();
  @Test(dataProvider="dp")
  public void orangeCrmTest(String username, String password) throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://opensource-demo.orangehrmlive.com/");
      System.out.println("navigated to the given url");
      sf.assertEquals(false, true);
      System.out.println("Assertion fail should be printed");
      driver.findElement(By.id("txtUsername")).sendKeys(username);
      driver.findElement(By.id("txtPassword")).sendKeys(password);
      sf.assertAll();
      
  }
  @DataProvider
  public Object[][] dp()
  {
	  Object[][] data = new Object[1][2];
	  data[0][0]="Admin";
	  data[0][1]="admin123";
	  return data;
	  
  }
}
