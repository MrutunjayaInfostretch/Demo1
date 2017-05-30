
package com.assignment.android.flipkartmobileapp.pages;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.step.*;

public class Homescreenflipkart extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.img.flipkart")
	private QAFWebElement btnImgFlipkart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBtnImgFlipkart() {
		return btnImgFlipkart;
	}

	public void closepopup() {

		getBtnImgFlipkart().click();
	}
	

	@QAFTestStep(description = "I open Flipkart Apllication")
	public void launchApplication() {
		driver.get("/");
	}

	@QAFTestStep(description = "I should see flipkart logo")
	public void verifyHomePage()
	{
	   
	}
}
