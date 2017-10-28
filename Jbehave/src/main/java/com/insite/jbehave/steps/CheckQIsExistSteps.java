package com.insite.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.insite.jbehave.validators.InsiteJbehaveAuthValidator;
import com.insite.jbehave.validators.InsiteJbehaveQueriValidator;

public class CheckQIsExistSteps extends InsiteJbehaveAuthValidator {

	InsiteJbehaveQueriValidator qValidator = new InsiteJbehaveQueriValidator();

	@Given("I am on insite home page")
	public void goToInsiteHomePage() throws Exception {
		checkInsiteMainPage();
		loginInsite();
		buttonPressLoginInsite();
	}

	@When("I hit the $Queries page item")
	public void iHitTheNavigationMenuItem(String pageName) throws Exception {
		clickOnNavigationMenuItem(pageName);
	}

	@When("I authenticate as user $gevorg")
	public void authenticateVAInsite(String userName) throws Exception {
		loginToVa(userName);

	}

	@Then("I should see my existing query named $GEVORG_VIEW_1")
	public void IShouldSeeMyExistingQuery(String qName) throws Exception {
		qValidator.checkQueryByName(qName);
	}
}
