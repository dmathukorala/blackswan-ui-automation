package com.blackswan.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.blackswan.pages.HomePageObjet;
import com.blackswan.pages.ProductPurchasePage;
import com.blackswan.pages.SmartWatchesPage;
import com.test.base.DriverBase;

public class DarazTest extends DriverBase {

	private HomePageObjet homePageObject;

	private SmartWatchesPage smartWatchesPage;

	private ProductPurchasePage productPurchasePage;

	private WebDriverWait wait;

	@BeforeClass
	public void loadPage() {

		driver.navigate().to(url);

		driver.manage().window().maximize();

		homePageObject = new HomePageObjet(driver);

		wait = new WebDriverWait(driver, 60);
	}

	@Test(priority = 1)
	public void navigateToSmartWatchesPageAndClickSmartWatchItem() {

		homePageObject.hoverElectronicCategory();

		wait.until(ExpectedConditions.visibilityOf(homePageObject.wearableSubCategory));

		homePageObject.hoverWearableSubCategory();

		wait.until(ExpectedConditions.visibilityOf(homePageObject.smartWatchLeafCategory));

		homePageObject.clickSmartWatchCategory();

		smartWatchesPage = new SmartWatchesPage(driver);

		wait.until(ExpectedConditions.visibilityOf(smartWatchesPage.smartWatchLabel));

		smartWatchesPage.clickSmartWatchItemByIdex(0);

		productPurchasePage = new ProductPurchasePage(driver);

		wait.until(ExpectedConditions.visibilityOf(productPurchasePage.smartWatchTitle));

		Assert.assertTrue(productPurchasePage.smartWatchTitle.getText().contains("Watch"));

	}

}
