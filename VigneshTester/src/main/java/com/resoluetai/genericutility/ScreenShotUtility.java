package com.resoluetai.genericutility;

import java.io.File;

import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
	public void takeScreenshot(WebDriver driver,String screenshotName) throws Throwable {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		// TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File permFile = new File("./errorshots/" + timestamp + screenshotName  +".png");
		FileUtils.copyFile(tempFile, permFile);
	}
}
