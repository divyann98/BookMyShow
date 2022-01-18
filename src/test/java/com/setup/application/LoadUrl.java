package com.setup.application;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class LoadUrl {
    public static AndroidDriver<WebElement> driver;

    @BeforeMethod(alwaysRun = true)
    public static void amazonApplication() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("Automation_Name", "UiAutomator2");
        dc.setCapability("appActivity", "com.movie.bms.splashscreen.SplashScreenActivity");
        dc.setCapability("appPackage", "com.bt.bms");
        driver = new AndroidDriver<WebElement>(dc);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeApp() {
        if (driver != null) {
            driver.quit();
        }
    }
}

