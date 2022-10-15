package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SuiteExample {
	
	WebDriver driver;
	long starttime;
	@BeforeSuite
	
	public void launchbrowser()
	{
	 starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test
	public void openbing()
	{
		driver.get("https://www.bing.com");
	}
	@Test
	public void opengoogle()
	{
		driver.get("https://www.google.co.in");
	}
	@Test
	public void openyahoo()
	{
		driver.get("https://www.yahoo.com");
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		long endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println("total time taken is :" +totaltime);
	}
	
}

