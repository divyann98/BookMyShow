package POM;

import SetUp.Generic;
import SetUp.LoadUrl;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ContactDetails
{


    @FindBy(id = "com.bt.bms:id/email_address")
    public static WebElement tapOnEmailAddress;

    @FindBy(id = "com.bt.bms:id/email_address")
    public static WebElement enterEmailAddress;

    @FindBy(id = "com.bt.bms:id/phone_number")
    public static WebElement tapOnPhoneNumber;

    @FindBy(id = "com.bt.bms:id/phone_number")
    public static WebElement enterPhoneNumber;

    @FindBy()
    public static WebElement updateDetails;

    public ContactDetails(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void detailsFilling() throws IOException, InterruptedException {
        Generic generic=new Generic();
        Properties p=generic.propertyFile();
        String email= (String) p.get("EmailAddress");

        String phone= (String) p.get("PhoneNumber");

        generic.explicitWait(ExpectedConditions.visibilityOf(ContactDetails.tapOnEmailAddress),10);
        tapOnEmailAddress.click();
        tapOnEmailAddress.sendKeys(email);

        tapOnPhoneNumber.click();
        tapOnPhoneNumber.sendKeys(phone);


        generic.keyboard();




    }


}
