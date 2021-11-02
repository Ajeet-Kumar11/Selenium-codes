package seleniumCoreFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("gmail");
		Thread.sleep(2000);
		List<WebElement> lst=driver.findElements(By.xpath("//li[@class='sbct']"));
		for(int i=0;i<lst.size();i++) 
		{
			String actTest=lst.get(i).getText();
			if(actTest.contains("login")) 
			{
			   lst.get(i).click();
			   break;
			}
		}
		driver.close();
        
        
	}

}