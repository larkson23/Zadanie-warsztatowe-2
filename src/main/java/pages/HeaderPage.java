package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#_desktop_user_info > div > a > span")
    private WebElement userSignInButton;

    public WebElement getUserSignInButton() {
        return getVisibleElement(userSignInButton);
    }
    public void clickUserSignInButton(){
        getUserSignInButton().click();
    }

    @FindBy(css = "#content > section > div > div:nth-child(2) > article > div > div.product-description > h3 > a")
    private WebElement HummingbirdPrintedSweater;

    public WebElement getHummingbirdPrintedSweater() {
        return getVisibleElement(HummingbirdPrintedSweater);
    }
    public void clickHummingbirdPrintedSweater(){
        getHummingbirdPrintedSweater().click();
    }
}

