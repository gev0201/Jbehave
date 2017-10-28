package com.insite.jbehave.validators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.insite.jbehave.utils.JbehaveInsitePropertiesConstants;

public class InsiteJbehaveAuthValidator extends InsiteJbehaveBaseValidator {

	public void checkInsiteMainPage() {
		String mainPageName = driver.findElement(By.cssSelector("span[class=login-header__title]")).getText();
		Assert.assertEquals("insite", mainPageName);
	}

	public void loginInsite(String username, String password) throws Exception {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public void loginToVa(String userName) throws InterruptedException {
		@SuppressWarnings("unused")
		WebElement webElement = waitByExpectedCondition(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector(".form-box")), 10);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("adminpwd");
		driver.findElement(By.cssSelector(".login-button")).click();
	}

	public void loginInsite() throws Exception {
		loginInsite(JbehaveInsitePropertiesConstants.DEFAULT_USERNAME, 
				JbehaveInsitePropertiesConstants.DEFAULT_PASSWORD);
	}

	public void buttonPressLoginInsite() throws Exception {
		driver.findElement(By.className("login-button")).click();
		String homePageName = driver.findElement(By.xpath("//*[contains(text(), 'Queries')]")).getText();
		Assert.assertEquals("Queries", homePageName);
	}

	public void checkInsiteQueriPage() throws Exception {
		String homePageName = driver.findElement(By.xpath("//*[contains(text(), 'Queries')]")).getText();
		Assert.assertEquals("Queries", homePageName);
	}

}
