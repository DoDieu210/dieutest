package com.dieutest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage extends BasePage {

	public DepositPage(WebDriver driver) {
		super(driver);
	}
	

	By accountNoPath = By.name("accountno");
	By amountPath = By.name("ammount");
	By descPath = By.name("desc");
	
	By submitBtnPath = By.name("AccSubmit");

	public void submitAmountDeposit(String accountNo, String amount, String desc) {
		driver.findElement(accountNoPath).sendKeys(accountNo);
		driver.findElement(amountPath).sendKeys(amount);
		driver.findElement(descPath).sendKeys(desc);

		driver.findElement(submitBtnPath).click();
	}

}
