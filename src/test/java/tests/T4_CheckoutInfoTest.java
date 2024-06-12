package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.CheckoutInfoPage;

public class T4_CheckoutInfoTest extends T0_BaseTest{
        CheckoutInfoPage checkoutInfoObj;
        static Faker faker = new Faker();
        public String fname= "Basma", lname= "Hijazy";
        String zipCode= faker.address().zipCode();



        @Test (priority = 1)
        public void userFillCheckoutInfo() throws InterruptedException {
            checkoutInfoObj = new CheckoutInfoPage(driver);
            checkoutInfoObj.fillCheckoutInfo(fname, lname, zipCode);
        }

        @Test (priority = 2)
        public void userProceedToCheckoutPage () throws InterruptedException {
            checkoutInfoObj = new CheckoutInfoPage(driver);
            checkoutInfoObj.proceedToCheckoutPage();
        }


}

