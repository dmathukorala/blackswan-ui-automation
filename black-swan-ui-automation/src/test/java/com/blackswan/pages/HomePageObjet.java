package com.blackswan.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjet {

	private static WebDriver driver;

	@FindBy(xpath = "//span[text()='Electronic Accessories']")
	public static WebElement electronicMainCategory;

	@FindBy(xpath = "//span[text()='Wearable']")
	public static WebElement wearableSubCategory;

	@FindBy(xpath = "//span[text()='Smart watches']")
	public static WebElement smartWatchLeafCategory;

	private static Actions action;

	public HomePageObjet(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

		action = new Actions(driver);

	}

	public void hoverElectronicCategory() {

		action.moveToElement(electronicMainCategory).perform();
	}

	public void hoverWearableSubCategory() {

		action.moveToElement(wearableSubCategory).perform();
	}

	public void clickSmartWatchCategory() {

		smartWatchLeafCategory.click();

	}

}
