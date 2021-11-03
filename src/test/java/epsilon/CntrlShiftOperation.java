package epsilon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CntrlShiftOperation 
{
static WebDriver driver;

  @Test
  public void controlShift()
  {
	    driver.findElement(By.id("email")).click();
	    System.out.println("click done");
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("a");
		act.keyUp(Keys.SHIFT).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a");
		act.keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.id("pass")).click();
		act.keyDown(Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.SHIFT).build().perform();
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
		driver.get("https://www.facebook.com/");
  }
  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }
}

