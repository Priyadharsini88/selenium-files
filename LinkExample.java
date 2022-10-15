package LearnAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		
		//WebElement hyperlink=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a/img"));
		//hyperlink.click();
		
		driver.navigate().back();
		
		WebElement Findreflink=driver.findElement(By.partialLinkText("Find where am supposed "));
		String s1=Findreflink.getAttribute("href");
		System.out.println("this link navigates to:" + s1);
		
		WebElement brokenlink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		Thread.sleep(3000);
		String title =driver.getTitle(); //getting title of the driver 
		
		if(title.contains("400")) {
			System.out.println("The lnik is Broken");
		}
		
		driver.navigate().back();
		
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));//finding no of links by list ..
		
		int nooflinks=totallinks.size();
		
		System.out.println(nooflinks);
		
		
		
		
		
	}

}
