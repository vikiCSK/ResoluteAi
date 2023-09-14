package com.resoluteai.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLicense {

	WebDriver driver;

	public ManageLicense(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getManageLicenses() {
		return manageLicenses;
	}

	public WebElement getAddLicense() {
		return addLicense;
	}

	public WebElement getBack() {
		return back;
	}
	
	
	public WebElement getEmployeeId() {
		return employeeId;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getPhoneNumber() {
		return phoneNumber;
	}


	public WebElement getBusNo() {
		return busNo;
	}


	public WebElement getEmailId() {
		return emailId;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	@FindBy(xpath = "//span[text()='Manage Licenses']")
	private WebElement manageLicenses;

	@FindBy(xpath = "//p[text()='Add License']")
	private WebElement addLicense;

	@FindBy(xpath = "//p[text()='Back']")
	private WebElement back;
	
	@FindBy(xpath = "//input[@name='empId']")
	private WebElement employeeId;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath= "//input[@placeholder='phoneNumber']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='busNo']")
	private WebElement busNo;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//p[text()='Submit Details']")
	private WebElement submitButton;
	
}
