package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.selenium.qa.ExtendReportListner.ExtendReportListner.class)
public class Zabra
{
	
  @Test()
  public void m1()
  {
	  Assert.assertEquals(false, true);
	  System.out.println("m1 method executed");
  }
  @Test(dependsOnMethods="m1")
  public void m2() 
  {
	  System.out.println("m2 method executed");
  }
  @Test()
  public void m3() 
  {
	  System.out.println("m3 method executed");
  }
  
}
