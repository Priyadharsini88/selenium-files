package LearnAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> itemlist=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int listsize=itemlist.size();
		System.out.println(listsize);
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(itemlist.get(0));
		actions.clickAndHold(itemlist.get(1));
		actions.clickAndHold(itemlist.get(2));
		actions.build().perform();
		
		

	}

}
