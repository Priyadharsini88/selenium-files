package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement check1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		check1.click();//check java
		WebElement check2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[2]"));
		check2.click();//check VB
		
		WebElement notselected =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]"));
		Boolean a1=notselected.isSelected();
		
		if(a1==true)
		{
			System.out.println("it is selected");
		
		}
		
		WebElement selectedbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		Boolean a2=selectedbox.isSelected();
		
		if (a2==true)
		{
			selectedbox.click();//deselecting the selcted checkbox.
		}
		
		driver.quit();		
				
		
		

	}

}
