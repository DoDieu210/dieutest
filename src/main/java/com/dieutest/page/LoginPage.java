package com.dieutest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	By usernamePath = By.name("uid");
	By passwordPath = By.name("password");
	By loginBtnPath = By.name("btnLogin");

	public void login(String username, String password) {
		driver.findElement(usernamePath).sendKeys(username);
		driver.findElement(passwordPath).sendKeys(password);
		driver.findElement(loginBtnPath).click();
	}

}
