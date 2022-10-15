package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		WebElement name=driver.findElement(By.id("age"));
		String Tooltiptext= name.getAttribute("title"); //for retriving the tooltip text as in html format ,in html it is with "title"
		name.sendKeys("Priya"); //giving value to enter in the text box 
		System.out.println(Tooltiptext);
		
		//driver.close();
		
	}

}
