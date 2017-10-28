package com.insite.jbehave.validators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.insite.jbehave.utils.JbehaveConstants.*;

public class InsiteJbehaveQueriValidator extends InsiteJbehaveBaseValidator {

	public void checkQueryByName(String qName) throws Exception {
		TimeUnit.MILLISECONDS.sleep(100);
		List<WebElement> allQueries = getElementBySelector(QUERY_LIST_DATATABLE_LI_SELECTOR)
				.findElements(By.cssSelector(QUERY_LIST_DATATABLE_ITEMS_SELECTOR));
		TimeUnit.MILLISECONDS.sleep(100);
		for (int i = 0; i < allQueries.size(); i++) {

			if (allQueries.get(i).findElement(By.cssSelector(QUERY_LIST_QUERYNAME_SELECTOR)).getText().equals(qName)) {
				break;
			}
		}
	}
}