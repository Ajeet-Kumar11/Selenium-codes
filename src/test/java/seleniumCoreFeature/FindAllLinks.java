package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindAllLinks 
{
static WebDriver driver;

  @Test
  public void f()
  {
	  List<WebElement> lst=driver.findElements(By.xpath("//a"));
	  for(int i=0;i<lst.size();i++)
	  {
		String links=lst.get(i).getText();
		System.out.println(links);
	  }
  }
  @BeforeMethod
  public void setUp() 
  {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.javatpoint.com/how-to-print-ascii-value-in-java");
  }
  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }
}
