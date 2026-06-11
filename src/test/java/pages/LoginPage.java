package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "View menu")
    private WebElement viewMenu;

    @AndroidFindBy(accessibility = "Login Menu Item")
    private WebElement viewLogin;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement textfieldUsername;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private WebElement textfieldPassword;

    @AndroidFindBy(accessibility = "Tap to login with given credentials")
    private WebElement buttonLogin;

    //TITTLE
    @AndroidFindBy(accessibility = "title")
    private WebElement titleHome;

    public void clickMenuLogin() {
        viewMenu.click();
        viewLogin.click();
    }

    public void successLogin() {
        textfieldUsername.sendKeys("bod@example.com");
        textfieldPassword.sendKeys("10203040");
        buttonLogin.click();
    }

    public boolean isLoginSuccess() {
        return titleHome.isDisplayed();
    }


}
