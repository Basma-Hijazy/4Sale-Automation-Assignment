package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInfoPage extends BasePage {

    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }

    private By fNameField = By.id("first-name");
    private By lNameField = By.id("last-name");
    private By zipCodeField = By.id("postal-code");
    private By continueBtn = By.id("continue");


    private WebElement getFNameField() { return driver.findElement(fNameField); }
    private WebElement getLNameField() { return driver.findElement(lNameField); }
    private WebElement getZipCodeField() { return driver.findElement(zipCodeField); }
    private WebElement getContinueBtn() { return driver.findElement(continueBtn); }


    public void fillCheckoutInfo (String fName, String lName, String zipCode) throws InterruptedException {
        getFNameField().sendKeys(fName);
        getLNameField().sendKeys(lName);
        getZipCodeField().sendKeys(zipCode);
    }

    public void proceedToCheckoutPage () throws InterruptedException {
        getContinueBtn().click();
    }

}
