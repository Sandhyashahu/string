package testngdiscussion;



import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





public class MethodDiscussion {
	@BeforeClass
	public void beforeclass ()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass ()
	{
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void Beforemethod ()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void Afteremethod ()
	{
		System.out.println("after method");
	}
	
	
	@Test(priority=1)
	
 public void admin()
 {
		System.out.println("admin");
 }
	@Test(priority=2)
	public void login()
	 {
		
			System.out.println("login");
			Reporter.log("login method", true);
  
	 }
	 @Test()

	 
	 public void Dashbord()
	 {
		
			System.out.println("dashbord");
	 }

}
