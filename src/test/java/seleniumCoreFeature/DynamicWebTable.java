package seleniumCoreFeature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> lst=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		System.out.println(lst.size());
        for(int i=0;i<lst.size();i++) 
        {
        	String text=lst.get(i).getText();
        	if(text.contains("Italy")) 
        	{
        		System.out.println(text);
        		break;
        	}
        }
			
	}

}
