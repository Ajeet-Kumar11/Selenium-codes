package seleniumCoreFeature;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownHanding 
{
	public static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement wb=driver.findElement(By.xpath("//select[@name='country']"));
		Select sct = new Select(wb);
		//sct.selectByIndex(6);
	//sct.selectByValue("AUSTRALIA");
	//sct.selectByVisibleText("AUSTRALIA");
		List<WebElement> lst=sct.getOptions();
		for(int i=0;i<lst.size();i++)
		{
			String text=lst.get(i).getText();
			if(text.contains("AUSTRALIA"))
			{
				lst.get(i).click();
			}
		}
		
		
	}

}
