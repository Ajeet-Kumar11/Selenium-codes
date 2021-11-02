package seleniumCoreFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
{

	public static void main(String[] args)
	{
		String baseUrl = "http://demo.guru99.com/test/guru99home/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
			System.out.println("********We are switch to the iframe*******");
  		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		    //Clicks the iframe
			System.out.println("*********We are done***************");
			
   }
}	
