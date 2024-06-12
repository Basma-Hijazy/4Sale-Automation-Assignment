package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class T5_CheckoutTest extends T0_BaseTest{
    CheckoutPage checkoutObj;
    String orderCompletionMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";


    @Test
    public void userProceedToCheckoutPage () throws InterruptedException {
        checkoutObj = new CheckoutPage(driver);
        checkoutObj.confirmOrder();
        Assert.assertTrue(checkoutObj.assertOrderCompletionMsg.contains(orderCompletionMsg));
    }


}
