package POM;

import SetUp.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectSeats
{

    @FindBy(id = "com.bt.bms:id/select_seats_button_picker")
    public static WebElement tapOnLetsSelectSeats;

    @FindBy(id = "com.bt.bms:id/pay_button_seat_layout")
    public static WebElement tapOnPay;

    public SelectSeats(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void selectThreeSeats() throws InterruptedException {

        Generic generic=new Generic();
        Thread.sleep(2000);
        generic.tapByCoordinates(295,1679);

        generic.explicitWait(ExpectedConditions.visibilityOf(SelectSeats.tapOnLetsSelectSeats),10);
        SelectSeats.tapOnLetsSelectSeats.click();

        generic.implicitWait(10);

        Thread.sleep(2000);

        generic.tapByCoordinates(102,629);

        generic.tapByCoordinates(224,629);

        generic.tapByCoordinates(346,629);

        SelectSeats.tapOnPay.click();


    }
}
