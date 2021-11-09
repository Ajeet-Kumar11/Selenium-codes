package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CalenderHandling2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		Thread.sleep(2000);
		String datePicker= "//div[@aria-label='Mon Apr 25 2022']";
		int count=0;
	    while(count<12) 
	    {
	    	try 
	    	{
	    		driver.findElement(By.xpath(datePicker)).click();
	    		break;
	    	}
	    	catch(Throwable t)
	    	{
	    		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	    		count++;
	    	}
	    	
	    	
	    }
	    driver.quit();
		

	}

}
