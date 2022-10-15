package testNG;

import org.testng.annotations.Test;

public class SampletestNG {
	@Test(priority=0)
	
	public void firsttestcase()
	{
		System.out.println("first test case");
	}
	@Test(priority=2)
	public void secondtestcase()
	{
		System.out.println("2nd test case");
	}
	@Test(priority=1,enabled=false)
	public void thirdtestcase()
	{
		System.out.println("3rd test case");
	}
	@Test
	public void fourthtestcase()
	{
		System.out.println("4th test case");
	}
	@Test(dependsOnMethods= "fourthtestcase")
	public void fifthtestcase()
	{
		System.out.println("5th test case");
	}

}
