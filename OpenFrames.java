package LearnAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0); //since the button is inside a frame,we r switching into it ..
		WebElement button1=driver.findElement(By.id("Click")); //tapping on the button.
		button1.click();
		
		String s1=driver.findElement(By.id("Click")).getText();
		System.out.println(s1);
		
		driver.switchTo().defaultContent();//switching to default content 
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");//finding nested frame ...
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		
		String s2=driver.findElement(By.id("Click1")).getText();
		System.out.println(s2);
		
		driver.switchTo().defaultContent();
	        List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
	        int size=totalframes.size();
	        System.out.println(size);
	        
	        
		
		
		
		
		
	}

}
