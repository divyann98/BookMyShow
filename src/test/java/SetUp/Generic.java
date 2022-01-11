package SetUp;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Generic extends LoadUrl
{
    public void scrollDown(String text)
    {
        app.findElementByAndroidUIAutomator
                        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + text
                                + "\").instance(0))")
                .click();

    }

    public void explicitWait(Function element, int time )
    {

        WebDriverWait wait=new WebDriverWait(app,time);

        wait.until(element);
    }

    public  void implicitWait(int time)
    {
        app.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void tapByCoordinates (int x,  int y)
    {

        new TouchAction(app)
                .tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }
    public Properties propertyFile() throws IOException {
        Properties pf=new Properties();
        FileInputStream fp=new FileInputStream("/home/qq379/eclipse-workspace/BookMyShow/src/test/java/data.properties");
        pf.load(fp);
        return pf;
    }

    public void keyboard()
    {
        app.hideKeyboard();
    }

}
