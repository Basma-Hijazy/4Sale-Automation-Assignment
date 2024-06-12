package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public String assertOrderCompletionMsg;

    private By finishOrderBtn = By.id("finish");
    private By orderCompletedMsg = By.className("complete-text");


    private WebElement getFinishOrderBtn() {
        return driver.findElement(finishOrderBtn);
    }
    private WebElement getOrderCompletedMsg() { return driver.findElement(orderCompletedMsg); }


    public void confirmOrder() {
        getFinishOrderBtn().click();
        assertOrderCompletionMsg = getOrderCompletedMsg().getText();
    }


}


