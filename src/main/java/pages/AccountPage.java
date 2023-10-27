package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css = "#_desktop_logo > a > img")
    private WebElement logo;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return getVisibleElement(logo);
    }
    public void clickLogo(){
        getLogo().click();
    }

    @FindBy(id = "history-link")
    private WebElement orderHistory;

    public WebElement getOrderHistory(){ return getVisibleElement(orderHistory);}

    public void clickOrderHistory(){
        getOrderHistory().click();
    }

}
