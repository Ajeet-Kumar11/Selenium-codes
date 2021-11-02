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
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/");
		WebElement wb=driver.findElement(By.xpath("//input[@id='email']"));
		act.moveToElement(wb).click().sendKeys("rkumarajeet92@gmail.com");
		act.keyDown(Keys.CONTROL).sendKeys("a");
		act.sendKeys("c");
		WebElement wb2=driver.findElement(By.xpath("//input[@id='pass']"));
		act.moveToElement(wb2).click().keyDown(Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		driver.close();
		
	}

}
