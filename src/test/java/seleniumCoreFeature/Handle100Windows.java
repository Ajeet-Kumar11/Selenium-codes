package seleniumCoreFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle100Windows
{
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	    driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
	    Thread.sleep(2000);
	    Set<String> st=driver.getWindowHandles();
	    List<String> lst = new ArrayList<String>(st);
	    for(String title:lst)
	    {
	    	String actTitle=driver.switchTo().window(title).getTitle();
	    	if(actTitle.equals("Sign Up | LinkedIn"))
	    	{
	    		driver.switchTo().window(title);
	    		driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("ajeet");
	    		Thread.sleep(2000);
	    		driver.quit();
	    	}
	    }


	}

}
