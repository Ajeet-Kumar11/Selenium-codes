package seleniumCoreFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.getTitle());

	}

}
