package com.insite.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.insite.jbehave.validators.InsiteJbehaveAuthValidator;

public class LoginSteps extends InsiteJbehaveAuthValidator {

	@Given("I am on insite login page")
	public void IAmOnInsiteLoginPage() throws Exception {
		checkInsiteMainPage();
	}

	@When("I input the insite username $username and password $password")
	public void inputInsiteLoginCredential(String username, String password) throws Exception {
		loginInsite(username, password);
	}

	@When("I hit the login button")
	public void pressLoginbutton() throws Exception {
		buttonPressLoginInsite();
	}

	@Then("I should login to insite home page")
	public void checkInsiteHomePage() throws Exception {
		checkInsiteQueriPage();
	}
}
