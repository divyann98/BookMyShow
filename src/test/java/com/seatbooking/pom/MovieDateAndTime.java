package com.seatbooking.pom;


import com.setup.application.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

import java.util.List;

public class MovieDateAndTime
{
    @FindBy(xpath = "//*[@text=\"19\"]")
    public static WebElement choosingDate;

    @FindBy(xpath = "//*[@text=\"01:30 PM\"]")
    public static WebElement choosingTime;

    @FindBy(id = "com.bt.bms:id/show_times_tab_date_text")
    public static List<WebElement> allAvailableDate;

    @FindBy(id = "com.bt.bms:id/primary_cta_venue_message_showtimes")
    public static WebElement acceptTermsAndConditions;

    @FindBy(id="com.bt.bms:id/movie_show_timing_text")
    public static WebElement timingForShow;

    public MovieDateAndTime(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void timings(){
        Generic generic=new Generic();
        generic.explicitWait(ExpectedConditions.visibilityOf(MovieDateAndTime.choosingDate),10);
        MovieDateAndTime.choosingDate.click();

        generic.explicitWait(ExpectedConditions.visibilityOf(MovieDateAndTime.choosingTime),10);
        MovieDateAndTime.choosingTime.click();

        generic.explicitWait(ExpectedConditions.visibilityOf(MovieDateAndTime.acceptTermsAndConditions),10);
        MovieDateAndTime.acceptTermsAndConditions.click();
    }
    public void selectDate(String date){
        for(WebElement e:allAvailableDate){
            if(e.getText().equals(date)){
                e.click();
                break;
            }
        }
    }
    public void clickTime(){
        try{
        timingForShow.click();
        acceptTermsAndConditions.click();
        }
        catch(Exception e)
        {
            Reporter.log("time already selected");
        }
    }
}
