package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.Base.basePage;

/**
 * 
 * @author Ramakrishna
 *
 */
public class paymentPage extends basePage {

	@FindBy(xpath = "//*[@id='row_18']/ul[4]/li")
	WebElement selectSeat;

	@FindBy(xpath = "//span[@class='ico16 quicks f700']")
	WebElement proceedPayment;
	

	@FindBy(id = "tab_wallet")
	WebElement clickOnWallet;

	@FindBy(id = ".walletWrap")
	WebElement amazonPay;

	@FindBy(css = "#walletPayNow > div > button")
	WebElement walletPayNow;

	@FindBy(css = ".dF.padT20>button")
	WebElement clickOnAllertButton;

	/**
	 * 
	 * initialize The PaymentPage
	 *
	 */

	public paymentPage() {
		PageFactory.initElements(driver, this);

	}
	
	/**
	 * 
	 * if Showing "Allert covid 19" click on OK button, else click on proceedPayment Button
	 * 
	 *
	 */

	public void clickOnAllert() {
		String allert = prop.getProperty("allert");
		if (allert.equals("#SkipTheQueue")) {
			clickOnAllertButton.click();
			proceedPayment.click();

		} else {
			proceedPayment.click();
		}

	}
	
	/**
	 * 
	 * click on Wallet Button,Shown pay thorough AmazonPayWallet
	 * click on WalletPayNow
	 * 
	 *
	 */
	public void amazonWallet() {
		clickOnWallet.click();
	
		walletPayNow.click();
	}

}
