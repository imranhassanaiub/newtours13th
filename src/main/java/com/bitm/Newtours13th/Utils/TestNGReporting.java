package com.bitm.Newtours13th.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting implements ITestListener{

	public void onStart(ITestContext arg)
	{
		System.out.println("Test execution has started ->"+arg.getName());
	}
	
  	public void onTestStart(ITestResult arg)  
    {
    	System.out.println("Test has started ->"+arg.getName());
	}
  	
	public void onTestSuccess(ITestResult arg)  
    {
    	System.out.println("Test has Passed ->"+arg.getName());
	}
	
	public void onTestFailure(ITestResult arg)  
    {
    	System.out.println("Test has Failed ->"+arg.getName());
    }
	
 	public void onTestSkipped(ITestResult arg)  
    {
    	System.out.println("Test was Skipped ->"+arg.getName());
	}
 	
 	public void onFinish(ITestContext arg)  
    {
    	System.out.println("Test execution has ended ->"+arg.getName());
	}
}
