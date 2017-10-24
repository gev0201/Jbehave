package com.insite.jbehave.validators;

import org.openqa.selenium.By;

import com.helpsystems.common.util.TestUtils;

public class InsiteJbehaveAuthValidator extends InsiteJbehaveBaseValidator {

	public void loginCredentials(String username, String password) throws Exception {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void buttonPressLogin() throws Exception {
		driver.findElement(By.className("login-button")).click();

	}

}
