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
public class SelectFlightTest {

	private WebDriver driver = null;

	@Test
	public void selectFlightPageTitle() {
		driver = DriverManager.driver;

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.SelectFlight.DEPART_SELECT_BTN)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.SelectFlight_PAGE_TITLE);
	}

	@Test(dependsOnMethods = "selectFlightPageTitle")
	public void SelectAFlightTest() {
		driver.findElement(By.xpath(XpathUtils.SelectFlight.DEPART_SELECT_BTN)).click();
		driver.findElement(By.xpath(XpathUtils.SelectFlight.RETURN_SELECT_BTN)).click();
		driver.findElement(By.xpath(XpathUtils.SelectFlight.CONTINUE_TO_BOOKFLIGHT_BTN)).click();
	}
}
