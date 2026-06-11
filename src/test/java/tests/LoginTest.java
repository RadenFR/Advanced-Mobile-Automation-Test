package tests;

import core.BaseTest;
import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        loginPage.clickMenuLogin();
        loginPage.successLogin();

        Assert.assertTrue(loginPage.isLoginSuccess(), "Login Gagal");
    }
}
