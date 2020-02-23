package com.bitm.Newtours13th.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.Newtours13th.DTO.LoginDTO;
import com.bitm.Newtours13th.DataProvider.LoginDataProvider;
import com.bitm.Newtours13th.Utils.DriverManager;
import com.bitm.Newtours13th.Utils.UrlTextUtils;
import com.bitm.Newtours13th.Utils.XpathUtils;

public class LoginTest {

	private WebDriver driver = null;
	
	@Test(priority = 1)
	public void checkloginpagetitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.LOGIN_PAGE_TITLE);
		System.out.println("Login Page Title Verified");
	}
	@Test (priority=2,dataProvider = "loginData",dataProviderClass = LoginDataProvider.class)
	public void logintest(List<LoginDTO> logindata)
	{
		for(LoginDTO login: logindata){
		driver.findElement(By.xpath(XpathUtils.Login.USER_NAME)).sendKeys(login.getUsername());
		driver.findElement(By.xpath(XpathUtils.Login.PASSWORD)).sendKeys(login.getPassword());
		driver.findElement(By.xpath(XpathUtils.Login.SIGN_IN_BTN)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Login Successfully in newtours");
		}
		}
}
