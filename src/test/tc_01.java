package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ui.homepage;
import ui.loginpage;
import util.genric.GetData;
import util.pro_spe.CreateDriver;

public class tc_01 
{
	WebDriver driver;
	loginpage login;
	homepage home;
	
	/*@Test (priority = 2)
	public void VerifyValidLogin_TC01() {
		String username = GetData.fromexcel("./Test_Data/Data.xlsx", "credentials", 0, 0);
		String pwd = GetData.fromexcel("./Test_Data/Data.xlsx", "credentials", 0, 1);
		login.waitforloginpage();
		login.getusername().sendKeys(username);
		login.getnext().click();
		login.getpassword().sendKeys(pwd);
		login.getsignin().click();
		home.waitForHomePage();
		String actual = "Enter Time-Track";
		//String expected = home.getPageTitle().getText();
		//System.out.println(expected);
		//Assert.assertEquals(expected, actual);
		
	}*/

	@Test
	public void VerifyInvalidLogin_TC02() throws InterruptedException 
	{
		
		String un = GetData.fromexcel("./Test_Data/Data.xlsx", "Credentials", 1, 0);
		String pw = GetData.fromexcel("./Test_Data/Data.xlsx", "Credentials", 1, 1);
		System.out.println(un);
		login.waitforloginpage();
		login.getusername().sendKeys(un);
		login.getnext().click();
		login.getpassword().sendKeys(pw);
		login.pasnext().click();
		//login.getsignin().click();
		String actual = "Wrong password. Try again.";
		Thread.sleep(10000);
		String expected = login.getErrorMessage().getText();
		System.out.println(expected);
		Assert.assertEquals(expected, actual);
	}

	@BeforeMethod
	public void PreCondition() {
		driver = CreateDriver.getDriver();
		login = new loginpage(driver);
		home = new homepage(driver);
		}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
