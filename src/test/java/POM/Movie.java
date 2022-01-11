package POM;

import SetUp.Generic;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Movie
{
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"NEW_NAV_MENU_MOBILE\"]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView\n")
    public static WebElement clickOnMovies;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"listing-mob-1\"]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
    public static WebElement clickOnMovieName;

    public Movie(AndroidDriver<WebElement> app)
    {
        PageFactory.initElements(app,this);
    }

    public void selectMovies()
    {
        Generic generic=new Generic();
        generic.explicitWait(ExpectedConditions.visibilityOf(Movie.clickOnMovies),10);
        clickOnMovies.click();

        generic.explicitWait(ExpectedConditions.visibilityOf(Movie.clickOnMovieName),10);
        clickOnMovieName.click();

    }
}
