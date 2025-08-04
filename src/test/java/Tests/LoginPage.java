package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.WebDriverManagerSetup;

public class LoginPage extends WebDriverManagerSetup
{
	@BeforeMethod
	public void Login()
	{
		initializeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void Credentials()
	{
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("student");
		
		WebElement pasword=driver.findElement(By.name("password"));
		pasword.sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}
	
		@AfterMethod
		public void close() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();
		}

}
