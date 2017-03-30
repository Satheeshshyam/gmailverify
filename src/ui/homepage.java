package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage 
{
	WebDriver driver;
	public homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void  waitForHomePage()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//public WebElement getPageTitle()
	//{
		//return driver.findElement(By.xpath(".//*[@id=':gb']/div/div[2]/span/a"));
	//}
}
