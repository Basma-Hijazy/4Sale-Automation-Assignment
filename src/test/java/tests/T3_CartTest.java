package tests;


import org.testng.annotations.Test;
import pages.CartPage;

public class T3_CartTest extends T0_BaseTest{

    CartPage cartObj;


    @Test
    public void userNavigateToCheckoutInformation () throws InterruptedException {
        cartObj = new CartPage(driver);
        cartObj.navigateToCheckoutInformation();
    }
}
