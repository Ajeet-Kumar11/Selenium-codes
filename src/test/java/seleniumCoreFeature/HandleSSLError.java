package seleniumCoreFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLError 
{
	public static void main(String[] args) 
	{
		DesiredCapabilities handleSSLError = DesiredCapabilities.chrome();
		handleSSLError.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver(handleSSLError);
	}

}
