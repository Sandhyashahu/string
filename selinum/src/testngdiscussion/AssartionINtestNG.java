package testngdiscussion;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class AssartionINtestNG {
	
	@Test
	public void dashbord()
	{
	
		System.out.println("login page display");
		Reporter.log("login method", true);

	}
	@Test
	public void login()
	{
		Reporter.log("login method", true);
		System.out.println("login page display");
		Assert.assertTrue(null, false);
	}
	 
	
	
	

}
