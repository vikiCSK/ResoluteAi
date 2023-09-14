package com.resoluteai.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogout {

	WebDriver driver;

	public LoginLogout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getAttendanceLogs() {
		return AttendanceLogs;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement loginButton;

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement Dashboard;

	@FindBy(xpath = "//span[text()='Attendance Logs']")
	private WebElement AttendanceLogs;

	@FindBy(xpath = "//span[text()='Log Out']")
	private WebElement logoutButton;
}
