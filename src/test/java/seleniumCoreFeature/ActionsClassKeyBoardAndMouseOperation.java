package seleniumCoreFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassKeyBoardAndMouseOperation 
{

	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://en-gb.facebook.com/");
			Actions act = new Actions(driver);
			WebElement wb=driver.findElement(By.id("email"));
			act.moveToElement(wb).click().sendKeys("ajeet").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c");
			act.keyUp(Keys.CONTROL).build().perform();
			WebElement wb1=driver.findElement(By.id("pass"));
			act.moveToElement(wb1).click().keyDown(Keys.CONTROL).sendKeys("v");
			act.keyUp(Keys.CONTROL).build().perform(); 
		
	}

}
