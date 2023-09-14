package resoluteai;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.resoluetai.genericutility.BaseClass;
import com.resoluetai.genericutility.ScreenShotUtility;
import com.resoluteai.pomrepo.LoginLogout;
import com.resoluteai.pomrepo.ManageLicense;

@Test (invocationCount = 3)
public class resoluteAi extends BaseClass {
	public void LoginScenerio() throws IOException, Throwable {
		ScreenShotUtility s = new ScreenShotUtility();
		LoginLogout l = new LoginLogout(driver);
		ManageLicense m = new ManageLicense(driver);
		webdriverUtils.implicitWait(driver);
		l.getEmail().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
		l.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		l.getLoginButton().click();
		Thread.sleep(13000);
		Actions a = new Actions(driver);
		a.moveToElement(l.getDashboard()).pause(2000).moveToElement(m.getManageLicenses()).pause(2000).click().build()
				.perform();

		Thread.sleep(2000);
		m.getAddLicense().click();
		Thread.sleep(2000);
		m.getBack().click();
		Thread.sleep(3000);

		m.getAddLicense().click();
		m.getEmployeeId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-eid"));
		m.getFirstName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-fn"));
		m.getLastName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-ln"));
		m.getPhoneNumber().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-ph"));
		m.getBusNo().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-bn"));
		m.getEmailId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-emid"));
		m.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_01-pass"));
		Thread.sleep(5000);
		m.getSubmitButton().click();
		Thread.sleep(3000);

		m.getEmployeeId().clear();
		m.getFirstName().clear();
		m.getLastName().clear();
		m.getPhoneNumber().clear();
		m.getBusNo().clear();
		m.getEmailId().clear();
		m.getPassword().clear();

		m.getBack().click();
		Thread.sleep(3000);

		a.scrollToElement(m.getAddLicense());

		m.getAddLicense().click();
		m.getEmployeeId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-eid"));
		m.getFirstName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-fn"));
		m.getLastName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-ln"));
		m.getPhoneNumber().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-ph"));
		m.getBusNo().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-bn"));
		m.getEmailId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-emid"));
		m.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_02-pass"));
		Thread.sleep(5000);
		m.getSubmitButton().click();

		Thread.sleep(3000);

		m.getEmployeeId().clear();
		m.getFirstName().clear();
		m.getLastName().clear();
		m.getPhoneNumber().clear();
		m.getBusNo().clear();
		m.getEmailId().clear();
		m.getPassword().clear();

		m.getBack().click();
		Thread.sleep(3000);

		a.scrollToElement(m.getAddLicense());

		m.getAddLicense().click();
		m.getEmployeeId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-eid"));
		m.getFirstName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-fn"));
		m.getLastName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-ln"));
		m.getPhoneNumber().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-ph"));
		m.getBusNo().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-bn"));
		m.getEmailId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-emid"));
		m.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_03-pass"));
		Thread.sleep(5000);
		m.getSubmitButton().click();
		Thread.sleep(3000);
		s.takeScreenshot(driver, "AddLicence");

		m.getEmployeeId().clear();
		m.getFirstName().clear();
		m.getLastName().clear();
		m.getPhoneNumber().clear();
		m.getBusNo().clear();
		m.getEmailId().clear();
		m.getPassword().clear();

		m.getBack().click();
		Thread.sleep(3000);

		a.scrollToElement(m.getAddLicense());

		m.getAddLicense().click();
		m.getEmployeeId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-eid"));
		m.getFirstName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-fn"));
		m.getLastName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-ln"));
		m.getPhoneNumber().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-ph"));
		m.getBusNo().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-bn"));
		m.getEmailId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-emid"));
		m.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_04-pass"));
		Thread.sleep(5000);
		m.getSubmitButton().click();

		Thread.sleep(3000);

		m.getEmployeeId().clear();
		m.getFirstName().clear();
		m.getLastName().clear();
		m.getPhoneNumber().clear();
		m.getBusNo().clear();
		m.getEmailId().clear();
		m.getPassword().clear();

		m.getBack().click();
		Thread.sleep(3000);

		a.scrollToElement(m.getAddLicense());

		m.getAddLicense().click();
		m.getEmployeeId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-eid"));
		m.getFirstName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-fn"));
		m.getLastName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-ln"));
		m.getPhoneNumber().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-ph"));
		m.getBusNo().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-bn"));
		m.getEmailId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-emid"));
		m.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_05-pass"));
		Thread.sleep(5000);
		m.getSubmitButton().click();

		Thread.sleep(3000);

		m.getEmployeeId().clear();
		m.getFirstName().clear();
		m.getLastName().clear();
		m.getPhoneNumber().clear();
		m.getBusNo().clear();
		m.getEmailId().clear();
		m.getPassword().clear();

		m.getBack().click();
		Thread.sleep(3000);

		a.scrollToElement(m.getAddLicense());

		m.getAddLicense().click();
		m.getEmployeeId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-eid"));
		m.getFirstName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-fn"));
		m.getLastName().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-ln"));
		m.getPhoneNumber().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-ph"));
		m.getBusNo().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-bn"));
		m.getEmailId().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-emid"));
		m.getPassword().sendKeys(fileUtils.readTheDataFromPropertyFile("fgml_01_06-pass"));
		Thread.sleep(5000);
		m.getSubmitButton().click();
		m.getBack().click();
		Thread.sleep(3000);

		// logout
		a.moveToElement(l.getDashboard()).moveToElement(l.getLogoutButton()).click().sendKeys(Keys.ENTER)
				.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

	}
}
