package LearnAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/upload.html");
		
		WebElement uploadbutton=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		//Actions builder= new Actions(driver);
		//builder.moveToElement(uploadbutton);
		//builder.perform();
		
		//uploadbutton.sendKeys(Keys.ENTER);
		//JavascriptExecutor executor =(JavascriptExecutor) driver;
		//executor.executeScript("argument[0].click();",uploadbutton);
		
		uploadbutton.click();
		Thread.sleep(3000);
		
		String file="C:\\Priya\\image2.jpg";
		
		StringSelection selection=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		

	}

}
