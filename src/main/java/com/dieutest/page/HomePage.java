package com.dieutest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String menu = "//ul[@class=\"menusubnav\"]//*[text()=\"{{NAME}}\"]";

	public void clickMenu(String name) {
		String _menu = menu.replace("{{NAME}}", name);
		driver.findElement(By.xpath(_menu)).click();
	}

}
