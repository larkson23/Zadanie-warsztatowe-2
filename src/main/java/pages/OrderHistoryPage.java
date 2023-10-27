package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePage{


    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > table > tbody > tr:nth-child(1) > td.text-xs-right")
    public WebElement OrderValueElement;

    public WebElement getOrderValueElement() {
        return getVisibleElement(OrderValueElement);
    }

    public String getOrderValue() {
        return getOrderValueElement().getText();
    }

}

