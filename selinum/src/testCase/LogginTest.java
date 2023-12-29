package testCase;

import org.testng.annotations.Test;

public class LogginTest extends BaseTest {
	
	
	@Test
	public void login()
	{
		lp.loginToApp();
	    
		

		//db.Dashbord();

	}

	@Test(priority = 2)
	public void logout() throws InterruptedException{
		lp.logout();

	}

}
