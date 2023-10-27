import io.cucumber.java.en_old.Ac;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static org.junit.Assert.assertEquals;

public class ShopppingTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @Test
    public void shopping() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickUserSignInButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.writeEmail("Janusz@dzban");
        loginPage.writePassword("12345");
        loginPage.clickSignInButton();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickLogo();

        headerPage.clickHummingbirdPrintedSweater();

        HummingbirdPrintedSweaterPage hummingbirdPrintedSweaterPage = new HummingbirdPrintedSweaterPage(driver);
        hummingbirdPrintedSweaterPage.selectSize("m");
        hummingbirdPrintedSweaterPage.selectQuantity("5");
        hummingbirdPrintedSweaterPage.clickAddToCartButton();
        hummingbirdPrintedSweaterPage.clickCheckoutButton();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickAnotherCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.confirmAddress.click();
        checkoutPage.confirmDelivery.click();
        checkoutPage.clickPaymentCheck.click();
        checkoutPage.clickTermsOfServiceCheck.click();
        String checkoutValue = checkoutPage.getCheckoutValue();
        checkoutPage.clickPlaceOrderButton.click();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        Path destinationPath = Paths.get("C:\\Users\\larks\\OneDrive\\Dokumenty\\Rzeczy z kursu\\Screeny\\Screen.png");

        try {
            Files.copy(screenshotFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();

        }
        OrderConfirmedPage orderConfirmedPage = new OrderConfirmedPage(driver);
        orderConfirmedPage.clickUserButton();

        accountPage.clickOrderHistory();

        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        String orderHistoryValue = orderHistoryPage.getOrderValue();
        assertEquals(checkoutValue, orderHistoryValue);
    }
        @After
        public void after () {
            driver.close();
            driver.quit();
        }
    }
