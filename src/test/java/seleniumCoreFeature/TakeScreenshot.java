package seleniumCoreFeature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TakeScreenshot 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\z00467ka\\Desktop\\autoit\\google.png"));
		

	}

}
