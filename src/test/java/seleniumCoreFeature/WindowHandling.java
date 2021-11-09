package seleniumCoreFeature;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling 
{

	public static void main(String[] args) 
	{
		String baseUrl = "http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> str=driver.getWindowHandles();
		Iterator<String> itr=str.iterator();
		String parentWindow = itr.next();
		System.out.println(parentWindow);
		String childWindow = itr.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("rk@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
