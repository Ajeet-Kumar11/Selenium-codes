package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




//@Listeners(practice.CustomListener.class)
public class Kumar extends Main 
{
  @Test
  public void f1()
  {
		Assert.assertEquals(false, true);
	  
  }
  
  @BeforeMethod
  public void setUp()
  {
	  initialization();
  }
 
  
  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }
  
 
}
