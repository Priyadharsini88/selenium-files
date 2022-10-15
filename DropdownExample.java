package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//select by index 
		WebElement useIndexDD = driver.findElement(By.id("dropdown1"));
		Select select=new Select(useIndexDD);
		select.selectByIndex(2);
		Thread.sleep(3000);
		
		select.selectByValue("4");
		Thread.sleep(3000);
		
		select.selectByVisibleText("Selenium");
		
		Thread.sleep(3000);
		useIndexDD.sendKeys("Appium");
		
		
		
		//select by text
		
		WebElement usetext =driver.findElement(By.className("page page-id-153 page-template page-template-page-keyword-category page-template-page-keyword-category-php"));
		Select select2=new Select(usetext);
		select2.selectByVisibleText("Appium");
		
		//select by value 
		
		//WebElement useValue = driver.findElement(By.);
		//Select select=new Select(useIndexDD);
		//select.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		

	}

}
