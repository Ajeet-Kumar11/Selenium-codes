package testNgConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersss 
{
	WebDriver driver;
	
	  @Test(dataProvider="dp")
	  public void dataProvider(String email,String password)
	  {
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.close();
			
	  }
	  @DataProvider
	  public Object[][] dp() 
	  {
		  Object[][] arr = new Object[2][2];
		  arr[0][0]="ajeet";
		  arr[0][1]="ajeet";
		  arr[1][0]="ajeet";
		  arr[1][1]="ajeet";
		  return arr;
	  }
	}
