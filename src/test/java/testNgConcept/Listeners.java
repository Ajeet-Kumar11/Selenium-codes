package testNgConcept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println(result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
		System.out.println(result.getName());
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
		
	}

}
