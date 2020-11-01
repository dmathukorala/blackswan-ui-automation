package com.blackswan.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPurchasePage {

	private static WebDriver driver;

	@FindBy(xpath = "//span[@class='pdp-mod-product-badge-title']")
	public static WebElement smartWatchTitle;

	public ProductPurchasePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
