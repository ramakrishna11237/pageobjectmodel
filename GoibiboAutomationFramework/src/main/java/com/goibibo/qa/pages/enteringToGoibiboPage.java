package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.Base.basePage;

/**
 * 
 * @author Rama krishna
 * 
 *
 */

public class enteringToGoibiboPage extends basePage {

	@FindBy(id = "roundTrip")
	WebElement clickOnRoundTrip;

	@FindBy(id = "gosuggest_inputSrc")
	WebElement enterFromAddress;

	@FindBy(id = "react-autosuggest-1-suggestion--0")
	WebElement fromClick;

	@FindBy(id = "gosuggest_inputDest")
	WebElement enterToAddress;

	@FindBy(id = "react-autosuggest-1-suggestion--0")
	WebElement toClick;

	@FindBy(css = "#start-date_srp")
	WebElement ClickOnDeparture;

	@FindBy(css = ".DayPicker-NavButton.DayPicker-NavButton--next")
	WebElement navigateToDepartureDate;

	@FindBy(id = "fare_20200916")
	WebElement selectDepartureDate;

	@FindBy(id = "#end-date_srp")
	WebElement ClickOnReturn;

	@FindBy(id = "div.DayPicker-NavBar>span")
	WebElement navigateToReturnDate;

	@FindBy(id = "fare_20200928")
	WebElement selectReturnDate;

	@FindBy(id = "gi_search_btn")
	WebElement searchClick;
	/**
	 * 
	 *intitialization the enterigToGoibiboPage
	 * 
	 *
	 */
	public enteringToGoibiboPage() {
		PageFactory.initElements(driver, this);

	}
	/**
	 * perform Click Action on RoundTrip Button
	 * enter from Address
	 * enter to Address
	 * Navigation to Departure Date
	 * Select the Departure Date And perform Click action
	 * select the Return Date And Perform Click Action
	 * Click on Search Button
	 */

	public bookingPage enterFromAndToAddress() {
		clickOnRoundTrip.click();
		enterFromAddress.sendKeys("Delhi");
		fromClick.click();
		enterToAddress.sendKeys("Mumbai");
		toClick.click();

	
		navigateToDepartureDate.click();
		selectDepartureDate.click();
		

		selectReturnDate.click();
		searchClick.click();

		return new bookingPage();

	}

}
