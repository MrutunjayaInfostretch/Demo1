package com.assignment.android.flipkartmobileapp.pages;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.*;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.menu.flipkart")
	private QAFWebElement btnMenuFlipkart;
	@FindBy(locator = "btn.Electronics.flipkart")
	private QAFWebElement btnElectronicsFlipkart;

	@FindBy(locator = "btn.mobile.flipkart")
	private QAFWebElement btnmobileFlipkart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	@Override
	public void waitForPageToLoad() {
		QAFTestBase.pause(5000);
	}

	public QAFWebElement getBtnMenuFlipkart() {
		return btnMenuFlipkart;
	}

	public QAFWebElement getBtnElectronicsFlipkart() {
		return btnElectronicsFlipkart;

	}

	public QAFWebElement getBtnmobileFlipkart() {
		return btnmobileFlipkart;

	}
	
	@QAFTestStep
	public void selectMenuBar()
	{
		
	}
	


}
