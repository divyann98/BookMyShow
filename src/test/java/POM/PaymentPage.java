package POM;

import SetUp.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentPage
{
    @FindBy(id = "com.bt.bms:id/pay")
    public static WebElement paymentMethod;

    public PaymentPage(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void payMentDetails()
    {
        Generic generic=new Generic();
        generic.explicitWait(ExpectedConditions.visibilityOf(PaymentPage.paymentMethod),10);
        PaymentPage.paymentMethod.click();
    }
}
