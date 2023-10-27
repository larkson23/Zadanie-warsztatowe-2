package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "field-email")
    private WebElement emailInputField;

    @FindBy(id = "field-password")
    private WebElement passwordInputField;

    @FindBy(id = "submit-login")
    private WebElement signInButton;


    public WebElement getEmailInputField() {
        return getVisibleElement(emailInputField);
    }
    public WebElement getPasswordInputField() {
        return getVisibleElement(passwordInputField);
    }
    public WebElement getSignInButton(){
        return getVisibleElement(signInButton);
    }
    public void writeEmail(String email){
        getEmailInputField().sendKeys(email);
    }
    public void writePassword(String password){
        getPasswordInputField().sendKeys(password);
    }
    public void clickSignInButton(){
        getSignInButton().click();

    }
}
