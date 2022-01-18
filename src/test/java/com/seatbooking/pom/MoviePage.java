package com.seatbooking.pom;


import com.setup.application.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MoviePage {

    @FindBy(id = "com.bt.bms:id/imgNotifications")
    public static WebElement clickOnSearchBox;

    @FindBy(id = "com.bt.bms:id/edtSearch")
    public static WebElement searchMovie;

    @FindBy(id = "com.bt.bms:id/search_result_title")
    public static WebElement searchedMovie;

    @FindBy(id = "com.bt.bms:id/subtitle_header_main")
    public static WebElement selectCity;

    public MoviePage(AndroidDriver<WebElement> app) {
        PageFactory.initElements(app, this);
    }

    public void selectMovies(String movieName) {

        Generic generic = new Generic();

        generic.explicitWait(ExpectedConditions.visibilityOf(MoviePage.clickOnSearchBox), 10);
        clickOnSearchBox.click();

        generic.explicitWait(ExpectedConditions.visibilityOf(MoviePage.searchMovie), 10);
        searchMovie.sendKeys(movieName);

        MoviePage.searchedMovie.click();

    }

    public String isLocationSelected() {

        return selectCity.getText();
    }
}
