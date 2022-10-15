package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectExample {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		PageFactory.initElements(driver, OrangeHRMPageObjects.class);
		OrangeHRMPageObjects.username.sendKeys("Admin");
		OrangeHRMPageObjects.password.sendKeys("admin123");
		OrangeHRMPageObjects.login.click();
		
		
		/*
		 * OrangeHRMPageObjects orangehrmpageobect=new OrangeHRMPageObjects();
		 * OrangeHRMPageObjects.username(driver).sendKeys("Admin");
		 * OrangeHRMPageObjects.password(driver).sendKeys("admin123");
		 * OrangeHRMPageObjects.loginbutton(driver).click();
		 */
		
	
		/*
		 * WebElement username=driver.findElement(By.id("txtUsername"));
		 * username.sendKeys("Admin");
		 * 
		 * WebElement password=driver.findElement(By.id("txtPassword"));
		 * password.sendKeys("admin123");
		 * 
		 * WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		 * loginbutton.click();
		 */
		
		driver.switchTo().alert().dismiss();
		
		
		
		

	}

}
