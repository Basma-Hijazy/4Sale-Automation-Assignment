package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

   public String assertProductAdded ;
    private By openSortList = By.className("product_sort_container");
    private WebElement selectElement (){ return driver.findElement(openSortList); }
    Select select = new Select(selectElement());
    private By addToCart = By.cssSelector("[class='btn btn_primary btn_small btn_inventory ']");
    private By removeFromCart = By.cssSelector("[class='btn btn_secondary btn_small btn_inventory ']");
    private By openCart = By.className("shopping_cart_link");


    private WebElement getOpenSortList() { return driver.findElement(openSortList);}
    private WebElement getAddToCart() { return driver.findElement(addToCart); }
    private WebElement getRemoveFromCart() { return driver.findElement(removeFromCart);  }
    private WebElement getOpenCart() { return driver.findElement(openCart); }


    public void openSortList()  throws InterruptedException {
        getOpenSortList().click();
    }
    public void sortProductsWithLowPrice()  throws InterruptedException {
        select.selectByVisibleText("Price (low to high)");
    }

    public void addProductToCart()  throws InterruptedException {
        getAddToCart().click();
        assertProductAdded= getRemoveFromCart().getText(); //another option: "shopping_cart_badge"
    }

    public void openShoppingCart() throws InterruptedException {
        getOpenCart().click();
    }


}

