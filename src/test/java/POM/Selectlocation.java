package POM;

import SetUp.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class Selectlocation
{
    @FindBy(id = "com.bt.bms:id/btn_negative")
    public static WebElement tapOnSelectManually;

    @FindBy(xpath = "//*[@text=\"Bengaluru\"]")
    public static WebElement Bangalore;


    public Selectlocation(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void selectCities()
    {
        Selectlocation.tapOnSelectManually.click();

        Selectlocation.Bangalore.click();



    }
}
