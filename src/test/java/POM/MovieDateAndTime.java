package POM;

import SetUp.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MovieDateAndTime
{
    @FindBy(xpath = "//*[@text=\"13\"]")
    public static WebElement choosingDate;

    @FindBy(xpath = "//*[@text=\"01:00 PM\"]")
    public static WebElement choosingTime;

    @FindBy(id = "com.bt.bms:id/primary_cta_venue_message_showtimes")
    public static WebElement acceptTermsAndConditions;

    public MovieDateAndTime(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void timings()
    {
        Generic generic=new Generic();
        generic.explicitWait(ExpectedConditions.visibilityOf(MovieDateAndTime.choosingDate),10);
        MovieDateAndTime.choosingDate.click();

        generic.explicitWait(ExpectedConditions.visibilityOf(MovieDateAndTime.choosingTime),10);
        MovieDateAndTime.choosingTime.click();

        generic.explicitWait(ExpectedConditions.visibilityOf(MovieDateAndTime.acceptTermsAndConditions),10);
        MovieDateAndTime.acceptTermsAndConditions.click();
    }
}
