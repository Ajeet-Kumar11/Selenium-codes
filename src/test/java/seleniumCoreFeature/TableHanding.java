package seleniumCoreFeature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHanding 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//find the total headers
		List<WebElement> lst=driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String tableHeaders=lst.get(i).getText();
			System.out.println(tableHeaders);
		}
		//printing all the rows
		List<WebElement> lst1 = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(lst1.size());
		for(int i=0;i<lst1.size();i++)
		{
			String tableRows=lst1.get(i).getText();
			System.out.println(tableRows);
			
		}
		//printing all the datas in a table
		List<WebElement> lst2=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		for(int i=0;i<lst2.size();i++)
		{
			String totalDatas=lst2.get(i).getText();
			System.out.println(totalDatas);
		}
	}

}
