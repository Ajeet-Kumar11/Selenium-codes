package seleniumCoreFeature;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHanding 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://en-gb.facebook.com/");
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		WebElement wb = driver.findElement(By.xpath("//select[@name='country']"));
		Select sct = new Select(wb);
		List<WebElement> lst = sct.getOptions();
		System.out.println(lst.get(lst.size()-1).getText());//get last option
		sct.selectByValue("AMERICAN SAMOA");
		Thread.sleep(5000);
		driver.quit();
		//sct.selectByIndex(8);
		//sct.selectByVisibleText("ARGENTINA");
		//sct.selectByValue("ARGENTINA");
	}

}
