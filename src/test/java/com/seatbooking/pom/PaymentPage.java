package com.seatbooking.pom;


import com.setup.application.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PaymentPage
{
    @FindBy(id = "com.bt.bms:id/pay")
    public static WebElement paymentMethod;

    @FindBy(xpath = "//*[@text='Amount Payable']")
    public static List<WebElement> paymentPage;

    public PaymentPage(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void paymentDetails()
    {
        Generic generic=new Generic();
        generic.explicitWait(ExpectedConditions.visibilityOf(PaymentPage.paymentMethod),10);
        PaymentPage.paymentMethod.click();

    }

    public boolean isPaymentPageDisplayed()
    {
        return paymentPage.size() > 0;
    }
}
