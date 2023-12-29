package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisteners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case :"+result.getName()+" has been started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been Passed");

	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been failed");
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been skipped");

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
//		try {
////			Takescreenshoot.screenshot(driver, result.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" has been started");

	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" has been completed");

		
		
	}

}
