package com.bitm.Newtours13th.Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting implements ITestListener {

	private WebDriver driver = null;

	public void onStart(ITestContext arg) {
		System.out.println("Test execution has started ->" + arg.getName());
	}

	public void onTestStart(ITestResult arg) {
		System.out.println("Test has started ->" + arg.getName());
	}

	public void onTestSuccess(ITestResult arg) {
		System.out.println("Test has Passed ->" + arg.getName());
	}

	public void onTestFailure(ITestResult arg) {
		System.out.println("Test has Failed ->" + arg.getName());
		driver = DriverManager.driver;
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desfile = new File("C://Users//imran//Desktop//Selenium screenshot//selenium.png");

		try {
			FileHandler.copy(srcfile, desfile);
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Screenshot taken");
	}

	public void onTestSkipped(ITestResult arg) {
		System.out.println("Test was Skipped ->" + arg.getName());
	}

	public void onFinish(ITestContext arg) {
		System.out.println("Test execution has ended ->" + arg.getName());
	}
}
