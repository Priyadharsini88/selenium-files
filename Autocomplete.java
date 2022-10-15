package LearnAutomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement coursename=driver.findElement(By.id("tags"));
		coursename.sendKeys("i");//typing i 
		Thread.sleep(4000); //giving this for retriving options list 
		
		List <WebElement> options =driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));//added li to the last for list 
		
		System.out.println(options);
		
		for (WebElement webElement : options) {
			if (webElement.getText().equals("Appium")) {
				webElement.click();
			
		}
			
		}
		
		

	}

}
