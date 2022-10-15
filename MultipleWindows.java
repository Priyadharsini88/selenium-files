package LearnAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		String parentwindow=driver.getWindowHandle();//this method is for getting the parent window handle 
		
		WebElement button2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		button2.click();
		
		Set<String> newwindowhandles=driver.getWindowHandles();//this method is for handling all child windows and it is stored in a set (java collections)
		for(String childwindow: newwindowhandles) { //for iterating all windows 
			driver.switchTo().window(childwindow); //for moving to new window 
			
		}
		
		int noofwindows=driver.getWindowHandles().size();
		System.out.println("No of windows opened: " + noofwindows);
		
		//driver.switchTo().defaultContent(); //this method switches to parent window 
		//Thread.sleep(3000);
		//driver.close();
		
		for (String allwindows:newwindowhandles) //for ( string temp vlaue : all values)
		{
			if(!allwindows.equals(parentwindow)) //checking the opened window is a parent window 
			{
				driver.switchTo().window(allwindows); //if the opened window is not a parent window,then close it ...
				driver.close();
			}
		}
		

	}

}
