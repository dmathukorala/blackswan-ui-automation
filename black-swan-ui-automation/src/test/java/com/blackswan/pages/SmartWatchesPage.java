package com.blackswan.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartWatchesPage {

	private static WebDriver driver;

	@FindBy(xpath = "//span[text()='SmartWatches']")
	public static WebElement smartWatchLabel;

	@FindBy(xpath = "//*[contains(@data-qa-locator,'product-item')]")
	public static List<WebElement> smartWatchList;

	public SmartWatchesPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void clickSmartWatchItemByIdex(Integer index) {

		smartWatchList.get(index).click();

	}

}
