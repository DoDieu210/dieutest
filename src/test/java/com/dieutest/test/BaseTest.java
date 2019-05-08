package com.dieutest.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dieutest.page.BasePage;
import com.dieutest.page.DepositPage;
import com.dieutest.page.HomePage;
import com.dieutest.page.LoginPage;
import com.dieutest.page.NewAccountPage;
import com.dieutest.page.NewCustomerPage;

public class BaseTest {
	WebDriver driver;

	BasePage basePage;
	DepositPage depositPage;
	LoginPage loginPage;
	NewCustomerPage newCustomerPage;
	NewAccountPage newAccountPage;
	HomePage homePage;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		basePage = new BasePage(driver);
		depositPage = new DepositPage(driver);
		loginPage = new LoginPage(driver);
		newCustomerPage = new NewCustomerPage(driver);
		newAccountPage = new NewAccountPage(driver);
		homePage = new HomePage(driver);
	}

	@Test
	public void test1() {
		basePage.navigate("http://demo.guru99.com/v4/");

		loginPage.login("mngr193415", "nEdyzes");

		homePage.clickMenu("New Customer");
		newCustomerPage.addNewCustomer("customer", "m", "10/15/1989", "Q9", "HCM", "HCM", "123456", "0909999888",
				"customers7@gmail.com", "customer2");
		String customerId = newCustomerPage.getCustomerId();

		homePage.clickMenu("New Account");
		newAccountPage.addNewAccount(customerId, "Savings", "100000");
		String accountNo = newAccountPage.getAccountNo();

		homePage.clickMenu("Deposit");
		depositPage.submitAmountDeposit(accountNo, "100000", "my deposit");

	}

	@After
	public void after() {
		if (driver != null) {
			driver.quit();
		}
	}

}
