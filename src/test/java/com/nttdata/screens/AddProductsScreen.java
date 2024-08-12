package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AddProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnBackpack;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnBike;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement btnTShirt;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddProduct;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnIncrease;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"View menu\"]")
    private WebElement btnMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Catalog\"]")
    private WebElement btnCatalog;


    // implementar los clicks

    public void clickBackpack() {
        btnBackpack.click();
    }
    public void clickTShirt() {
        btnTShirt.click();
    }
    public void clickAddProduct() {
        btnAddProduct.click();
    }

    public void openMenu() {
        btnMenu.click();
    }

    public void navigateToCatalog() {
        btnCatalog.click();
    }
}