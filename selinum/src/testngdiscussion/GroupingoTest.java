 package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingoTest {
	
	@Test
	public void nvagoApp()
	{
		
		System.out.println("login page display");
	}
	
	@Test(groups =  {"sanity","Regration","functional"})
	public void login()
	{
		System.out.println("test case 3");
	}
	
	@Test(groups =  "sanity")
	public void dashbord()
	{
		System.out.println("login page display");
	}
	
	@Test(groups =  "regartion")
	public void buy()
	{
		System.out.println("regartion testing");
	}
	

	@Test(groups =  "functional")
	public void sell()
	{
		System.out.println("sell the product");  
	}
	
	@Test(groups =  "sanity")
	public void logout()
	{
		System.out.println("login page display");
	}
	
	
}
