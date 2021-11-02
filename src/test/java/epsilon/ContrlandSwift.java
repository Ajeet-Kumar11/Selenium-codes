package epsilon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContrlandSwift
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT);
		act.keyDown(Keys.CONTROL);
		act.build().perform();

	}

}
