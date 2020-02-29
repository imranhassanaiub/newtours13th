package com.bitm.Newtours13th.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bitm.Newtours13th.Utils.DriverManager;
import com.bitm.Newtours13th.Utils.TestNGReporting;
import com.bitm.Newtours13th.Utils.UrlTextUtils;
import com.bitm.Newtours13th.Utils.XpathUtils;

@Listeners(TestNGReporting.class)
public class FlightFinderTest {

	private WebDriver driver = null;

	@Test()
	public void checkFlightFinderPageTitle() {
		driver = DriverManager.driver;

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FlightFinder.OneWay_BTN)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.FlightFinder_PAGE_TITLE);
	}

	@Test(dependsOnMethods = "checkFlightFinderPageTitle")
	public void FindAFlightTest() {

		driver.findElement(By.xpath(XpathUtils.FlightFinder.OneWay_BTN)).sendKeys("test");
		;

	}
}
