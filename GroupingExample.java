package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class GroupingExample {
	@Test(groups= {"Ford"})
	public void Ford1()
	{
		System.out.println("Ford1");
		
	}
	@Test(groups= {"Ford"})
	public void Ford2()
	{
		System.out.println("Ford2");
		
	}
	@Test(groups= {"Hyundai"})
	public void Hyundai1()
	{
		System.out.println("Hyundai1");
		
	}
	@Test(groups= {"Hyundai"})
	public void Hyundai2()
	{
		System.out.println("Hyundai2");
		
	}
	@Test(groups = {"BMW"})
	public void BMW1()
	{
		System.out.println("BMW1");
		
	}
	@Test(groups = {"BMW"})
	public void BMW2()
	{
		System.out.println("BMW2");
		
	}
	@Test
	@Parameters("Name")
	
	public void parametrization(String name )
	{
		System.out.println("My name is: "+name);
	}

}
