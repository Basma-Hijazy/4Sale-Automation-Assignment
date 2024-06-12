package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By userNameFieldLocator = By.id("user-name");
    private By passwordFieldLocator = By.id("password");
    private By loginBtnLocator = By.id("login-button");
    private By sideListLocator = By.id("react-burger-menu-btn");
    private By logoutLocator = By.id("logout_sidebar_link");
    private By closeSideListLocator = By.id("react-burger-cross-btn");

    private WebElement getUserNameField() {
        return driver.findElement(userNameFieldLocator);
    }
    private WebElement getPasswordField() {
        return driver.findElement(passwordFieldLocator);
    }
    private WebElement getLoginBtn() {
        return driver.findElement(loginBtnLocator);
    }
    // Elements with wait
    private WebElement getSideList(WebDriverWait wait) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sideListLocator));
    }
    private WebElement getLogout(WebDriverWait wait) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLocator));
    }
    private WebElement getCloseSideList(WebDriverWait wait) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(closeSideListLocator));
    }

    public boolean isLogoutVisible ;
    public void loginWithValidData(String username, String password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        getUserNameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginBtn().click();
        getSideList(wait).click();
        isLogoutVisible = getLogout(wait).isDisplayed();
        getCloseSideList(wait).click();

    }
}






