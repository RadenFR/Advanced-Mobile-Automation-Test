package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(AndroidDriver driver) {super(driver);}

        @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[1]")
        private WebElement slBackpack;

        @AndroidFindBy(accessibility = "Tap to add product to cart")
        private WebElement buttonAddToCart;

        @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]/android.widget.ImageView")
        private WebElement buttonCart;

        @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
        private WebElement tittleCart;

        public void addToCart() {
            slBackpack.click();
            buttonAddToCart.click();
            buttonCart.click();
        }

        public boolean successAddToCart() {
            return tittleCart.isDisplayed();
        }
}
