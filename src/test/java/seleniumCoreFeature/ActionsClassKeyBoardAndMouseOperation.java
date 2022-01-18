package seleniumCoreFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassKeyBoardAndMouseOperation 
{

	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");
		    Actions act = new Actions(driver);
			WebElement element=driver.findElement(By.id("email"));
			act.moveToElement(element).click().sendKeys("ajeet");
			act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c");
			act.keyUp(Keys.CONTROL).build().perform();
			WebElement wb=driver.findElement(By.id("pass"));
			act.moveToElement(wb).click().keyDown(Keys.CONTROL).sendKeys("v");
			act.keyUp(Keys.CONTROL).build().perform();
		
	}

}
