package seleniumCoreFeature;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BootstrapDrpdown 
{

	
	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='button' and @class='multiselect dropdown-toggle btn btn-default']")).click();
			Thread.sleep(2000);
			List<WebElement> lst=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
			for(int i=0;i<lst.size();i++) 
			{
				String actText=lst.get(i).getText();
				if(actText.contains("Angular")) 
				{
					lst.get(i).click();
					break;
				}
			}
			driver.close();
			  
	        
		}

	}