package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin
{
@FindBy(id = "com.bt.bms:id/launcher_tv_for_skip")
    public static WebElement skip_signin;

public Signin(AndroidDriver<WebElement> app)
{
    PageFactory.initElements(app,this);
}

public void skipSigninPage()
{
    Signin.skip_signin.click();

}


}
