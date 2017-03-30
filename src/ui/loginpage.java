package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage 
{
	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
		public void waitforloginpage()
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next")));
		}
		
	public WebElement getusername()
	{
		return driver.findElement(By.id("Email"));
	}
	public WebElement getnext()
	   {
		return driver.findElement(By.id("next"));	
		}
	public WebElement getpassword()
	{
		return driver.findElement(By.id("Passwd"));
	}
	public WebElement getsignin()
	{
		return driver.findElement(By.id("signIn"));
	}
	public WebElement getErrorMessage()
	{
		return driver.findElement(By.id("errormsg_0_Passwd"));
	}
}
