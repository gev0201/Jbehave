package com.insite.jbehave.validators;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.insite.jbehave.utils.JbehaveInsitePropertiesConstants;

public class InsiteJbehaveBaseValidator {

	public static WebDriver driver;
	public String baseUrl;

	public <T> T waitByExpectedCondition(ExpectedCondition<T> expectedCondition, long timeout) {
		T object = new WebDriverWait(driver, timeout).until(expectedCondition);
		return object;
	}

	@BeforeStories
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				new File(JbehaveInsitePropertiesConstants.CHROME_DRIVER_PATH).getCanonicalPath());
		driver = new ChromeDriver();
		driver.get(baseUrl = JbehaveInsitePropertiesConstants.BASE_URL + "/");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		@SuppressWarnings("unused")
		WebElement webElement = waitByExpectedCondition(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[class=login-header__title]")), 10);
	}

	@AfterStories
	public void webDriverQuit() throws Exception {
		driver.quit();
	}

	public void clickOnNavigationMenuItem(String itemName) throws Exception {
		@SuppressWarnings("unused")
		WebElement webElement = waitByExpectedCondition(ExpectedConditions.presenceOfElementLocated(By.id("content")),
				10);
		driver.findElement(By.xpath("//*[contains(text(), '" + itemName + "')]")).click();

	}
	
	public WebElement getElementBySelector(String selector) {
		return driver.findElement(By.cssSelector(selector));
	}

}
