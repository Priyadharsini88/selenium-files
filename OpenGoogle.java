package LearnAutomation;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//just print hello
                System.out.println("hello");
                //finding chrome driver  and providing its location 
                System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        		//creating a chrome driver object 
                WebDriver driver=new ChromeDriver();
                //giving link 
        		driver.get("http://leafground.com/");
        		//finding element using name ,entering value .
        		//driver.findElement(By.name("q")).sendKeys("Madurai"+ Keys.ENTER);
        		//driver.findElement(By.partialLinkText("Madurai district - Wikipedia")).click();
        		
        	 
        		WebElement  EditButton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
        		EditButton.click();
        		
        		WebElement emailbox= driver.findElement(By.id("email"));
        		emailbox.sendKeys("test@gmail.com");
        		
        		WebElement Appendbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
        		Appendbox.sendKeys("Selenium");
        		
        		WebElement Defaulttext =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
        		String value =Defaulttext.getAttribute("value");
        		
        		System.out.println(value);
        		
        		WebElement Clearbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
        		Clearbox.clear();
        		
        		
        		WebElement editbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
        		boolean editbx=editbox.isEnabled();
        		
        		System.out.println(editbx);
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
	}

}
