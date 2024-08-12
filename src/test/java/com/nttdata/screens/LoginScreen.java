package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    private WebElement txtUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"View menu\"]")
    private WebElement btnMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Log In\"]")
    private WebElement btnSubmenu;

    public void SingIn(String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(txtUser));
        waitFor(ExpectedConditions.elementToBeClickable(txtUser));
        txtUser.sendKeys(text);

    }

    public void sendPassword(String calve) {
        txtPassword.sendKeys(calve);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickMenu() {
        btnMenu.click();
    }

    public void clickSubMenu() {
        btnSubmenu.click();
    }
}
