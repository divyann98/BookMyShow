package com.seatbooking.pom;


import com.setup.application.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.Properties;

public class ContactDetailsPage {
    @FindBy(id = "com.bt.bms:id/email_address")
    public static WebElement tapOnEmailAddress;

    @FindBy(id = "com.bt.bms:id/email_address")
    public static WebElement enterEmailAddress;

    @FindBy(id = "com.bt.bms:id/phone_number")
    public static WebElement tapOnPhoneNumber;

    @FindBy(id = "com.bt.bms:id/phone_number")
    public static WebElement enterPhoneNumber;


    public ContactDetailsPage(AndroidDriver<WebElement> app) {
        PageFactory.initElements(app, this);
    }

    public void detailsFilling() throws IOException {
        Generic generic = new Generic();
        Properties p = generic.propertyFile();
        String email = (String) p.get("EmailAddress");

        String phone = (String) p.get("PhoneNumber");

        generic.explicitWait(ExpectedConditions.visibilityOf(ContactDetailsPage.tapOnEmailAddress), 10);
        tapOnEmailAddress.click();
        tapOnEmailAddress.sendKeys(email);

        tapOnPhoneNumber.click();
        tapOnPhoneNumber.sendKeys(phone);

        generic.keyboard();

        generic.tapByCoordinates(510, 2125);


    }


}
