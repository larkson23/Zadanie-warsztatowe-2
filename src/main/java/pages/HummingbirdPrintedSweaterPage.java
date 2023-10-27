package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HummingbirdPrintedSweaterPage extends BasePage {

    public HummingbirdPrintedSweaterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "group_1")
    private WebElement sizeList;

    @FindBy(id = "quantity_wanted")
    private WebElement quantityField;

    @FindBy(css = "#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.add > button")
    private WebElement addToCartButton;

    @FindBy(css = "#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a")
    private WebElement checkoutButton;

    public WebElement getSizeList() {
        return getVisibleElement(sizeList);
    }

    public WebElement getQuantityField() {
        return getVisibleElement(quantityField);
    }

    public WebElement getAddToCartButton() {
        return getVisibleElement(addToCartButton);
    }

    public WebElement getCheckoutButton() {return getVisibleElement(checkoutButton); }

    public void selectSize(String size) {
        getSizeList().sendKeys(size);
    }
    public void selectQuantity(String quantity) {
        getQuantityField().click();
        getQuantityField().sendKeys(Keys.BACK_SPACE);
        getQuantityField().sendKeys(quantity);
    }
    public void clickAddToCartButton(){
        getAddToCartButton().click();
    }
    public void clickCheckoutButton(){
        getCheckoutButton().click();
    }

    }

