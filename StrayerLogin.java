package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrayerLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://icampus.strayer.edu");
		
		WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("su200010009");
		
		WebElement password=driver.findElement(By.id("password"));
		//password.click();
		password.sendKeys("Strayer1892!!");
		
		WebElement Login=driver.findElement(By.id("submit-btn"));
		Login.click();

	}

}
