package tests;

import core.BaseTest;
import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddToCart() {
        CartPage cartPage = new CartPage(DriverManager.getDriver());

        cartPage.addToCart();

        Assert.assertTrue(cartPage.successAddToCart(),"Add To Cart Product Gagal");
    }
}
