package com.bitm.Newtours13th.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bitm.Newtours13th.DTO.FlightFinderDTO;
import com.bitm.Newtours13th.DataProvider.FlightFinderDataProvider;
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

	@Test(dependsOnMethods = "checkFlightFinderPageTitle", dataProvider = "flightfinderData", dataProviderClass = FlightFinderDataProvider.class)
	public void FindAFlightTest(List<FlightFinderDTO> flightfinderdata) {
		for (FlightFinderDTO flightfinder : flightfinderdata) {
			{

				driver.findElement(By.xpath(XpathUtils.FlightFinder.OneWay_BTN)).click();
				
				Select passenger = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.DROPDOWN_PASSENGERS)));
				passenger.selectByVisibleText(flightfinder.getPassengercount());
				
				Select depfrom = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_FROM)));
				depfrom.selectByVisibleText(flightfinder.getDepartingfrom());
				
				Select deponMon = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_ON_MONTH)));
				deponMon.selectByVisibleText(flightfinder.getDepartingOnMonth());
				
				Select deponDate = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.DEPARTING_ON_DATE)));
				deponDate.selectByVisibleText(flightfinder.getDepartingOnDate());
				
				Select arrin = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.ARRIVING_IN)));
				arrin.selectByVisibleText(flightfinder.getArrivingIn());
				
				Select reonMon = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.RETURNING_ON_MONTH)));
				reonMon.selectByVisibleText(flightfinder.getReturningOnMonth());
				
				Select reonDate = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.RETURNING_ON_DATE)));
				reonDate.selectByVisibleText(flightfinder.getReturningOnDate());
				
				driver.findElement(By.xpath(XpathUtils.FlightFinder.SERVICE_CLASS_BTN)).click();
				
				Select airlin = new Select(driver.findElement(By.xpath(XpathUtils.FlightFinder.AIRLINE_PREFERENECE)));
				airlin.selectByVisibleText(flightfinder.getAirline());
				
				driver.findElement(By.xpath(XpathUtils.FlightFinder.CONTINUE_TO_SELECTFLIGHT_BTN)).click();

			}
		}
	}
}
