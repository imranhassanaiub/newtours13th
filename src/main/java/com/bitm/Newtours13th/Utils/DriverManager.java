package com.bitm.Newtours13th.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	static {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\imran\\Desktop\\SeleniumFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	}

	public static WebDriver driver = new FirefoxDriver();

	private DriverManager() {

	}
}
