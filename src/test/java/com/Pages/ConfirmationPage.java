package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ConfirmationPage extends BaseClass{
	 public ConfirmationPage () {
PageFactory.initElements(driver, this);	}

@FindBy(id="my_itinerary")
private WebElement myItinerary;




public WebElement getMyItinerary() {
	return myItinerary;
}


}


