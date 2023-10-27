package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.js-cart-detailed-actions.card-block > div > a")
    private WebElement anotherCheckoutButton;

    public WebElement getAnotherCheckoutButton() {return getVisibleElement(anotherCheckoutButton); }

    public void clickAnotherCheckoutButton(){
        getAnotherCheckoutButton().click();
    }
}
