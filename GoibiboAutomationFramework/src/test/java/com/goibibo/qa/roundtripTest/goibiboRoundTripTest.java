package com.goibibo.qa.roundtripTest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.Base.basePage;
import com.goibibo.qa.pages.bookingPage;
import com.goibibo.qa.pages.enteringToGoibiboPage;
import com.goibibo.qa.pages.passingersPage;
import com.goibibo.qa.pages.paymentPage;
/**
 * 
 * @author Rama krishna
 * 
 *
 */
public class goibiboRoundTripTest extends basePage {

	enteringToGoibiboPage goibiboPage;
	bookingPage booking;
	paymentPage payment;
	passingersPage passingersDetails;
	String title = System.getProperty("title");
	String firstName = System.getProperty("firstName");
	String middleName = System.getProperty("middleName");
	String lastName = System.getProperty("lastName");
	String emailID = System.getProperty("emailID");
	String mobile = System.getProperty("mobile");

	public goibiboRoundTripTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialazation();
		goibiboPage = new enteringToGoibiboPage();
		booking = new bookingPage();
		passingersDetails = new passingersPage();

		payment = new paymentPage();
	}
/**
 *entering To  GoibiboPage
 *fill The Form,   From And To Address
 *sort By Prices
 *performing Click Action on Booking
 *showing Any Allert TravelProtection if You Need Travel Protuction Click On "Secure" Radio Button else Click On "I am willing to risk my trip" Radio Button
 *fill The Passinger Details and Perform he Click action on Proceed
 *showing Any Allert "A COVID-19 Travel Safety Measure" else click on Proceed Payment
 *perform ClickAction On Wallets
 *showing AmazonPay Perform Click Action On Pay
 *
 */
	@Test(priority = 1)
	public void roundTripDelhiToMumbai() {
		goibiboPage.enterFromAndToAddress();
		booking.sortByPrice1();
		booking.sortByPrice2();
		booking.clickOnBooking();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		passingersDetails.fillPassingerDetails(title, firstName, middleName, lastName, emailID, mobile);
		passingersDetails.travelProtection();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		payment.clickOnAllert();
		payment.amazonWallet();
	}

}
