package com.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.WebElements;
import utils.BaseClass;
import utils.XLUtils;

public class Register extends BaseClass {

	@Test(priority = 1)
	public void account() {

		WebElements elements = new WebElements(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(elements.MyAccount)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.Register)).click();
	}

	@Test(dataProvider = "test", priority = 2)
	public void registerPage(String FirstName, String LastName, String EmailID, String phone, String password,
			String confirmPassword) {

		WebElements elements = new WebElements(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(elements.FirstName)).sendKeys(FirstName);
		wait.until(ExpectedConditions.visibilityOf(elements.LastName)).sendKeys(LastName);
		wait.until(ExpectedConditions.visibilityOf(elements.Email)).sendKeys(EmailID);
		wait.until(ExpectedConditions.visibilityOf(elements.mobile)).sendKeys(phone);
		wait.until(ExpectedConditions.visibilityOf(elements.password)).sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(elements.confirmpswd)).sendKeys(confirmPassword);
		wait.until(ExpectedConditions.visibilityOf(elements.newsLetter)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.checkbox)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.submit)).click();
		logger.info((elements.content).getText());

		wait.until(ExpectedConditions.visibilityOf(elements.MyAccount)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.Logout)).click();
		
		wait.until(ExpectedConditions.visibilityOf(elements.MyAccount)).click();
		wait.until(ExpectedConditions.visibilityOf(elements.Register)).click();
	}

	@DataProvider(name = "test")
	public String[][] Customer_Details() throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\RegisterData.xlsx";
		XLUtils xlpath = new XLUtils(path);
		int totalrows = xlpath.getRowCount("Sheet1");
		System.out.println("Number of rows" + totalrows);
		int totalcols = xlpath.getCellCount("Sheet1", 1);
		System.out.println("Number of columns" + totalcols);

		String Details[][] = new String[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {
				Details[i - 1][j] = xlpath.getCellData("Sheet1", i, j);
				System.out.println(Details[i - 1][j]);
			}
		}

		return Details;

	}

}
