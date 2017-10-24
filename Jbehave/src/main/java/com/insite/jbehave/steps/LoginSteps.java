package com.insite.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.insite.jbehave.validators.InsiteJbehaveAuthValidator;

public class LoginSteps extends InsiteJbehaveAuthValidator {

	@Given("I am on insite index page")
	public void openInsite() throws Exception {
		openInsiteWebPage();
	}

	@When("I input the username $username and password $password")
	public void inputLoginCredential(String username, String password) throws Exception {
		loginCredentials(username, password);
	}

	@When("I hit the login button")
	public void pressLoginbutton() throws Exception {
	clickOnItemByClass("login-button");
	}

	@Then("I should login to insite home page")
	public void checkInsiteHomePage() throws Exception {
		webDreiwerQuit();
	}
}
