package com.assignment.android.flipkartmobileapp.tests;

import org.testng.annotations.Test;

import com.assignment.android.flipkartmobileapp.pages.HomeTestPage;
import com.assignment.android.flipkartmobileapp.pages.Homescreenflipkart;



public class Addtocart {
	
	
  @Test
  public void addprodudttocart() {
	 Homescreenflipkart homescreenflipkarc=new Homescreenflipkart();
	homescreenflipkarc.closepopup();
	HomeTestPage homepage=new HomeTestPage();
    homepage.waitForPageToLoad();
	homepage.getBtnMenuFlipkart().click();
	homepage.waitForPageToLoad();
	homepage.getBtnElectronicsFlipkart().click();

  }
}
