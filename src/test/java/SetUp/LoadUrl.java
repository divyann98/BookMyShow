package SetUp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class LoadUrl
{
    public static AndroidDriver<WebElement> app;

    @BeforeSuite(alwaysRun = true)
    public static void amazonApplication()
    {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("Automation_Name", "UiAutomator2");
        dc.setCapability("appActivity", "com.movie.bms.splashscreen.SplashScreenActivity");
        dc.setCapability("appPackage", "com.bt.bms");

        app = new AndroidDriver<WebElement>(dc);
        app.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
