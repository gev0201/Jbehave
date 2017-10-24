package com.insite.jbehave.validators;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsiteJbehaveBaseValidator extends InsiteJbehaveMain {

	protected WebDriver driver;
	protected String baseUrl;

	public <T> T waitByExpectedCondition(ExpectedCondition<T> expectedCondition, long timeout) {
		T object = new WebDriverWait(driver, timeout).until(expectedCondition);
		return object;
	}

	public void openInsiteWebPage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://10.67.0.20:3030/HelpSystemsSrc";
		driver.get(baseUrl + "/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		@SuppressWarnings("unused")
		WebElement webElement = waitByExpectedCondition(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[class=login-header__title]")), 10);
		String indexPageName = driver.findElement(By.cssSelector("span[class=login-header__title]")).getText();
		Assert.assertEquals("insite", indexPageName);
	}

	public void webDreiwerQuit() throws Exception {
		driver.quit();
	}

}
