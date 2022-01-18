package com.seatbooking.pom;


import com.setup.application.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectSeatsPage {

    @FindBy(id = "com.bt.bms:id/select_seats_button_picker")
    public static WebElement tapOnLetsSelectSeats;

    @FindBy(id = "com.bt.bms:id/pay_button_seat_layout")
    public static WebElement tapOnPay;

    @FindBy(id = "com.bt.bms:id/skip_fnb")
    public static WebElement skipSnaks;

    public SelectSeatsPage(AndroidDriver<WebElement> app) {
        PageFactory.initElements(app, this);
    }

    public void selectThreeSeats(String location) throws InterruptedException {

        Generic generic = new Generic();
        Thread.sleep(2000);
        if (location.equalsIgnoreCase("Bengaluru")) {
            generic.tapByCoordinates(295, 1679);
            generic.explicitWait(ExpectedConditions.visibilityOf(SelectSeatsPage.tapOnLetsSelectSeats), 10);
            SelectSeatsPage.tapOnLetsSelectSeats.click();
            generic.implicitWait(10);
            Thread.sleep(2000);
            generic.tapByCoordinates(102, 1235);
            generic.tapByCoordinates(163, 1299);
            generic.tapByCoordinates(104, 1363);
            SelectSeatsPage.tapOnPay.click();
        } else {
            generic.tapByCoordinates(485, 1700);

            generic.explicitWait(ExpectedConditions.visibilityOf(SelectSeatsPage.tapOnLetsSelectSeats), 10);
            SelectSeatsPage.tapOnLetsSelectSeats.click();
            generic.implicitWait(10);
            Thread.sleep(2000);
            generic.tapByCoordinates(285, 1337);
            generic.tapByCoordinates(163, 1399);
            generic.tapByCoordinates(894, 1167);
            SelectSeatsPage.tapOnPay.click();
            Thread.sleep(1000);
            // skipSnaks.click();
        }

    }

}
