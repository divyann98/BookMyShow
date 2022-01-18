package com.seatbooking.pom;


import com.setup.application.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BookTicketPage {
    @FindBy(xpath = "//*[@text=\"Book tickets\"]")
    private WebElement tapOnBookTickets;

    @FindBy(id = "com.bt.bms:id/format_selection_band_container")
    private WebElement popUpMessage;

    public BookTicketPage(AndroidDriver<WebElement> app) {
        PageFactory.initElements(app, this);
    }

    public void bookTic() throws InterruptedException {
        Generic generic = new Generic();
        generic.explicitWait(ExpectedConditions.visibilityOf(tapOnBookTickets), 10);
        tapOnBookTickets.click();
        Thread.sleep(2000);
        popUpMessage.click();
    }
}
