package LearnAutomation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/table.html");
		
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columnsize=columns.size();
		System.out.println("No of columns:" + columnsize);
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowssize=rows.size();
		System.out.println("No of rows:" + rowssize);
		
		List<WebElement> getpercentage=driver.findElements(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		int specificElement =getpercentage.size();
		System.out.println("no of learninteract values:" + specificElement);
		
		//getting all values of learn with interact and printing all vlaues 
		List<Integer> numberList=new ArrayList<Integer>();
		
		for (WebElement webelement:getpercentage)
		{
			String individualvalue=webelement.getText().replace("%", "");
			numberList.add(Integer.parseInt(individualvalue));
			
		}
		System.out.println("list:" + numberList);
		
		/// getting all values from progress column and calculating min value 
		
		List<WebElement> progressValues=driver.findElements(By.xpath("//td[2]"));
		int values=progressValues.size();
		System.out.println("No of progressvalues:" + values);
		
		List<Integer> percentagevalues= new ArrayList<Integer>();
		
		for (WebElement webelement:progressValues)
		{
		 String indvalue1=webelement.getText().replace("%", "");
		 percentagevalues.add(Integer.parseInt(indvalue1));
		}
		System.out.println("progressvalue list:" + percentagevalues);
		int smallvalue=Collections.min(percentagevalues);
		
		System.out.println(smallvalue);
		
		//to check the vlaue next to the small percentage value :
		
		String smallvaluestring =Integer.toString(smallvalue)+"%";
		String finalXpath="//[td[normalize-space()="+"\""+smallvaluestring + "\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
		
		
		
		
		
		
		
		
	}

}
