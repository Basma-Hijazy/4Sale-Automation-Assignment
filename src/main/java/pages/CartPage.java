package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By checkoutBtn = By.id("checkout");

    private WebElement getCheckoutBtn() { return driver.findElement(checkoutBtn); }

    public void navigateToCheckoutInformation() throws InterruptedException {
        getCheckoutBtn().click();

    }

}
