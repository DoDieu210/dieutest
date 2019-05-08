package com.dieutest.page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected static WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigate(String url) {
		driver.navigate().to(url);
	}

}
