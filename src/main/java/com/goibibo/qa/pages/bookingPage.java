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

public class bookingPage extends basePage {
	
	@FindBy(css = ".ico13.icon-arrow2-up.hpyBlueLt ")

	WebElement sortByPrice1;

	@FindBy(xpath = "//div[1]/div/div[1]/div/div[2]/div[2]/div/span[2]/label")
	WebElement select1;

	@FindBy(css = ".ico13.icon-arrow2-up.hpyBlueLt")
	WebElement sortByPrice2;
	@FindBy(xpath = "//div[2]/div/div[1]/div/div[2]/div[2]/div/span[2]/label")
	WebElement select2;

	@FindBy(css = ".button.fr.fltbook.fb.widthF105.quicks.fb")
	WebElement booking;

	@FindBy(css = ".fr.leadCheck.ins_chk.marginT10")
	WebElement secureNow;

	@FindBy(css = "#travellerForm >div>button")
	WebElement proceed;

	
	/**
	 * 
	 * Initialize the bookingPage
	 * 
	 *
	 */
	public bookingPage() {
		PageFactory.initElements(driver, this);
	}

	
	/**
	 * click on sortPrices, Departure Date;
	 * Showing The Highest Price at the Top, pick the Highest Prices;
	 * click on sortPrices, Return Date;
	 * Showing The Highest Price at the Top, pick the Highest Prices;
	 * perform The Click Action on Booking
	 *
	 */
	public void sortByPrice1() {
		sortByPrice1.click();
		select1.click();

	}

	public void sortByPrice2() {
		sortByPrice2.click();
		select2.click();
	}

	public void clickOnBooking() {

		booking.click();

	}

}
