package seleniumCoreFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleFrameByIndex
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    driver.switchTo().frame(1); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	        }
	    }