package com.dieutest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends BasePage {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
	}

	By customerNamePath = By.name("name");
	String genderRadioBtnPath = "//td[text()=\"Gender\"]/following-sibling::td/input[@value=\"{{ACTUAL_GENDER}}\"]";

	By dobPath = By.name("dob");
	By addressPath = By.name("addr");
	By cityPath = By.name("city");
	By statePath = By.name("state");
	By pinPath = By.name("pinno");
	By mobileNoPath = By.name("telephoneno");
	By emailPath = By.name("emailid");
	By passwordPath = By.name("password");
	
	By submitBtnPath = By.name("sub");
	
	By customerIdPath = By.xpath("//td[text()=\"Customer ID\"]/following-sibling::td");
	
	public void addNewCustomer(String customerName, String gender, String dayOfBirth, String address, String city, String state, String pin,
			String mobileNo, String email, String password) {
		
		driver.findElement(customerNamePath).sendKeys(customerName);
		
		String _genderRadioBtnPath = genderRadioBtnPath.replace("{{ACTUAL_GENDER}}", gender);
		driver.findElement(By.xpath(_genderRadioBtnPath)).click();
		
		driver.findElement(dobPath).sendKeys(dayOfBirth);
		driver.findElement(addressPath).sendKeys(address);
		driver.findElement(cityPath).sendKeys(city);
		driver.findElement(statePath).sendKeys(state);
		driver.findElement(pinPath).sendKeys(pin);
		driver.findElement(mobileNoPath).sendKeys(mobileNo);
		driver.findElement(emailPath).sendKeys(email);
		driver.findElement(passwordPath).sendKeys(password);
		
		driver.findElement(submitBtnPath).click();

	}

	public String getCustomerId() {
		return driver.findElement(customerIdPath).getText();
	}

}
