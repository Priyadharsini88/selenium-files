package LearnAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	
	String [][]data=null;
	WebDriver driver;
	
	@DataProvider (name="logindata")
	public String [][] logindataprovider() throws BiffException, IOException {
		data=getexceldata();
		return data;
		
	}
	@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	
	
	@Test(dataProvider = "logindata")
	public void loginHRM(String uname,String pwd) {
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pwd);
		
		WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		}
	
	public String[][] getexceldata() throws BiffException,IOException
	{
		FileInputStream excel= new FileInputStream("C:\\Users\\babua\\OneDrive\\Desktop\\Priya\\orangeHRM1.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		
		Sheet sheet =workbook.getSheet(0);
		int rowcount=sheet.getRows();
		int colcount=sheet.getColumns();
		
		String testdata[][]=new String [rowcount-1][colcount];
		
		for (int i=1;i<rowcount;i++) {
			for (int j=0;j<colcount;j++) {
				testdata[i-1][j]=sheet.getCell(j,i).getContents();
				
			}
			
		}
		return testdata;
	}
	
	@AfterTest
	public void Aftertest() {
		driver.quit();
	}

}
