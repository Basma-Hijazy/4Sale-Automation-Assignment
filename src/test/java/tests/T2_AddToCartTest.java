package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class T2_AddToCartTest extends T0_BaseTest{

    ProductsPage productsObject;

    @Test (priority = 1)
    public void userOpenSortList() throws InterruptedException {
        productsObject = new ProductsPage(driver);
        productsObject.openSortList();
    }
    @Test (priority = 2)
    public void userSortProductsWithLowPrice() throws InterruptedException {
        productsObject = new ProductsPage(driver);
        productsObject.sortProductsWithLowPrice();
    }
    @Test (priority = 3)
    public void userAddProductToCart() throws InterruptedException {
        productsObject = new ProductsPage(driver);
        productsObject.addProductToCart();
        Assert.assertEquals(productsObject.assertProductAdded,"Remove");
    }

    @Test (priority = 4)
    public void userOpenShoppingCart () throws InterruptedException {
        productsObject = new ProductsPage(driver);
        productsObject.openShoppingCart();
    }


}
