package util.pro_spe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.genric.GetData;

public class CreateDriver 
{
	public static WebDriver getDriver()
	{
		WebDriver driver=null;
		String BN=GetData.fromexcel("E:/satheesh/Selenium projects/Second/Proj2/Test_Data/Data.xlsx", "driver_conf", 0,0);
		String url=GetData.fromexcel("E:/satheesh/Selenium projects/Second/Proj2/Test_Data/Data.xlsx", "driver_conf", 0,1);
		System.out.println(BN + url);
		if(BN.equals("ff"))
		{
			System.setProperty("webdriver.firefox.marionette", "E:/satheesh/Selenium projects/Second/Proj2/Browser Servers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(BN.equals("gc"))
          {
        	  System.setProperty("webdriver.chrome.driver", "E:/satheesh/Selenium projects/Second/Proj2/Browser Servers/geckodriver.exe");
  			  driver=new ChromeDriver();
          }
		else
		{
			System.out.println("Invalid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

		return driver;
}
}
