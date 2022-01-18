package com.seatbooking.pom;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectLocationPage {
    @FindBy(id = "com.bt.bms:id/btn_negative")
    public static WebElement tapOnSelectManually;

    @FindBy(id = "com.bt.bms:id/location_pop_cities_name")
    public static List<WebElement> allPopularCities;


    public SelectLocationPage(AndroidDriver<WebElement> app) {
        PageFactory.initElements(app, this);
    }

    public void selectCities(String s1) {
        SelectLocationPage.tapOnSelectManually.click();

       // System.out.println(s1);
        for (WebElement e : allPopularCities) {
            if (e.getText().equalsIgnoreCase(s1)) {
                e.click();
                break;
            }
        }
    }
}
