package com.dieutest.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

public class NewAccountPage extends BasePage{

	public NewAccountPage(WebDriver driver) {
		super(driver);
	}

	By customerIdPath = By.name("cusid");
	By accTypePath = By.name("selaccount");
	By initialDepositPath = By.name("inideposit");
	By submitBtnPath = By.xpath("//input[@value=\"submit\"]");

	By accountIdPath = By.xpath("//td[text()=\"Account ID\"]/following-sibling::td");
	
	public void addNewAccount(String customerId, String accountType, String initDeposit) {

		driver.findElement(customerIdPath).sendKeys(customerId);
		
		Select select = new Select(driver.findElement(accTypePath));
		List<WebElement> elements = select.getOptions();
		for (WebElement e : elements) {
			if (accountType.trim().equals(e.getText().trim())) {
				e.click();
				break;
			}
		}
		

		driver.findElement(initialDepositPath).sendKeys(initDeposit);
		driver.findElement(submitBtnPath).click();
		
	}

	public String getAccountNo() {
		return driver.findElement(accountIdPath).getText();
	}

}
