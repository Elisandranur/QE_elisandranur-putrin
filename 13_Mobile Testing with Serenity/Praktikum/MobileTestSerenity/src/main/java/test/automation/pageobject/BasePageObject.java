package test.automation.pageobject;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.automation.driver.AndroidDriverPool;
import test.automation.driver.DriverPool;

import java.time.Duration;

public class BasePageObject {

    public DriverPool driver = new DriverPool();
    public AndroidDriverPool androidDriverPool = new AndroidDriverPool();

    public AndroidDriver getDriver() {
        if (driver.getAndroidDriver() == null) {
            driver.setAndroidDriver(this.androidDriverPool.create());
        }
        return driver.getAndroidDriver();
    }

    public WebDriverWait onWait() {
        return new WebDriverWait(getDriver(), 15);
    }

    public WebElement waitUntilClickable(By by) {
        return onWait().until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitUntilPresence(By by) {
        return onWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitUntilVisible(By by) {
        return onWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void onClick(By by) {
        waitUntilClickable(by).click();
    }

    public void onType(By by, CharSequence... keysToSend) {
        waitUntilPresence(by).sendKeys(keysToSend);
    }

    public void clear(By by) {
        waitUntilPresence(by).clear();
    }

    public boolean isElementInvisible(By by) {
        return onWait().until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
}