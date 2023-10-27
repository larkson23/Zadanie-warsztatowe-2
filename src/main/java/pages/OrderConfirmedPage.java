package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderConfirmedPage extends BasePage {

    public OrderConfirmedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#_desktop_user_info > div > a.account")
    private WebElement userButton;

    public WebElement getUserButton() {
        return getVisibleElement(userButton);
    }

    public void clickUserButton() {
        getUserButton().click();
    }

}



