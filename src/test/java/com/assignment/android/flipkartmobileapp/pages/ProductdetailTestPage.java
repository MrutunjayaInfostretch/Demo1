package com.assignment.android.flipkartmobileapp.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductdetailTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "text.mobilename.flipkart")
	private QAFWebElement textMobilenameFlipkart;
	@FindBy(locator = "filter.mobilename.flipkart")
	private QAFWebElement filterMobilenameFlipkart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getTextMobilenameFlipkart() {
		return textMobilenameFlipkart;
	}

	public QAFWebElement getFilterMobilenameFlipkart() {
		return filterMobilenameFlipkart;
	}

}
