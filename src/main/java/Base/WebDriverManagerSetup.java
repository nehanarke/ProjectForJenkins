package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetup
{
	protected static WebDriver driver;
	
	public void initializeDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void quiteDriver()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	public WebDriver getDriver()
	{
		return driver;
		
	}
}
