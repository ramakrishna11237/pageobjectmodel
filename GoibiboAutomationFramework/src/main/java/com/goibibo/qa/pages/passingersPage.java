package com.goibibo.qa.pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.goibibo.qa.Base.basePage;
/**
 * 
 * @author Ramakrishna
 *
 */
public class passingersPage extends basePage {

	@FindBy(css = ".fr.leadCheck.ins_chk.marginT10")
	WebElement secureNow;

	
	@FindBy(css = "Adulttitle1")
	WebElement firstName;
	//"Adulttitle1"
	
	@FindBy(css = "#risk-trip")
	WebElement riskTrip;
	@FindBy(css = "#travellerForm >div>button")
	WebElement proceed;

	/**
	 * initailize passingersPage
	 */
	public passingersPage() {
		PageFactory.initElements(driver, this);

	}

	
/**
 * entering Passinger Detalis
 * @param title
 * @param firstName
 * @param middleName
 * @param lastName
 * @param emailID
 * @param mobile
 */
	public void fillPassingerDetails(String title, String firstName, String middleName, String lastName, String emailID,
			String mobile) {
		System.out.println("Enter passinger Details:  ");
		Scanner sc = new Scanner(System.in);

		Select title_sel = new Select(driver.findElement(By.id("Adulttitle1")));
		title_sel.selectByVisibleText(title);
		System.out.println(title + " title is selected in the dropdown");

		
		WebElement fn = driver.findElement(By.id("AdultfirstName1"));
		 
		fn.sendKeys(firstName);
		System.out.println(firstName + " firstname is entered");

		WebElement mn = driver.findElement(By.id("AdultmiddleName1"));
		mn.sendKeys(middleName);
		System.out.println(middleName + " middleName is entered");

		WebElement ln = driver.findElement(By.id("AdultlastName1"));
		ln.sendKeys(lastName);
		System.out.println(lastName + "lastName is entered");

		WebElement ele_email = driver.findElement(By.id("email"));
		ele_email.sendKeys(emailID);
		System.out.println(emailID + " emailID is entered");

		WebElement phone = driver.findElement(By.id("mobile"));
		phone.sendKeys(mobile);
		System.out.println(mobile + " mobile number is entered");

	}
	/**
	 * showing  allert TravelProtection, if You Need Travel Protuction Click On "Secure" ;
	 * Click On Proceed Button
	 * 
	 */
	public void travelProtection() {
		System.out.println("Travel Protection");
		try{String Secure = prop.getProperty("secure");
		if (Secure.equals("Travel Protection")) {
			secureNow.click();
			proceed.click();
		} else {
			
			proceed.click();
		}}catch (Exception e1){
			
		}
		
	}

}
