package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "confirm-addresses")
    public WebElement confirmAddress;

    @FindBy(name = "confirmDeliveryOption")
    public WebElement confirmDelivery;

    @FindBy(id = "payment-option-1")
    public WebElement clickPaymentCheck;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    public WebElement clickTermsOfServiceCheck;

    @FindBy(css = "#payment-confirmation > div.ps-shown-by-js > button")
    public WebElement clickPlaceOrderButton;

    public WebElement getConfirmAddress() {
        return getVisibleElement(confirmAddress);
    }
    public WebElement getConfirmDelivery() {
        return getVisibleElement(confirmDelivery);
    }
    public WebElement getClickPaymentCheck() {
        return getVisibleElement(clickPaymentCheck);
    }
    public WebElement getClickTermsOfServiceCheck() {
        return getVisibleElement(clickTermsOfServiceCheck);
    }
    public WebElement getClickPlaceOrderButton() {
        return getVisibleElement(clickPlaceOrderButton);
    }

    public void confirmAddress() {
        getConfirmAddress().click();
    }
    public void confirmDelivery() {
        getConfirmDelivery().click();
    }
    public void clickPaymentCheck() {
        getClickPaymentCheck().click();
    }
    public void clickTermsOfServiceCheck() {
        getClickTermsOfServiceCheck().click();
    }
    public void clickPlaceOrderButton(){
        getClickPlaceOrderButton().click();
    }

    @FindBy(css = "#js-checkout-summary > div.card-block.cart-summary-totals.js-cart-summary-totals > div.cart-summary-line.cart-total > span.value")
    public WebElement checkoutValueElement;

    public WebElement getCheckoutValueElement() {
        return getVisibleElement(checkoutValueElement);
    }

    public String getCheckoutValue() {
        return getCheckoutValueElement().getText();
    }

}