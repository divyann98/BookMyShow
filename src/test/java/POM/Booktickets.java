package POM;

import SetUp.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Booktickets
{
@FindBy(xpath = "//*[@text=\"Book tickets\"]")
    public static WebElement tapOnBookTickets;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
public static WebElement popUpMessage;

public Booktickets(AndroidDriver<WebElement> app)
{
    PageFactory.initElements(app,this);
}

public void bookTic()
{
    Generic generic=new Generic();
    generic.explicitWait(ExpectedConditions.visibilityOf(Booktickets.tapOnBookTickets),10);
    Booktickets.tapOnBookTickets.click();

    Booktickets.popUpMessage.click();
}
}
