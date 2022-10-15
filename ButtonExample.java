package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/Button.html");
        
        //Finding color of the button 
        WebElement colorbox =driver.findElement(By.id("color"));
        String boxcolor=colorbox.getCssValue("color");
        System.out.println(boxcolor);
        
        //Finding height and width of the button 
        
        WebElement bottonsize =driver.findElement(By.id("size"));
        int height=bottonsize.getSize().getHeight();
        int width=bottonsize.getSize().getWidth();
        System.out.println("height of the button is "+ height + "width of the botton is" + width );
        
        
        
        
	}

}
