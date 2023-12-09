package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Complete {
    public WebDriver driver;

    public By checkoutComplete = By.xpath("//*[text()=\"Checkout: Complete!\"]");
    public By thankYouMsg = By.xpath("//*[text()=\"Thank you for your order!\"]");
    public By backButton = By.xpath("//button[@id=\"back-to-products\"]");

    public boolean isCheckoutCompleteDisplayed (){
        return driver.findElement(checkoutComplete).isDisplayed();
    }
    public boolean isThankYouMsgDisplayed (){
        return driver.findElement(thankYouMsg).isDisplayed();
    }
    public void clickOnBackButton (){
        driver.findElement(backButton).click();
    }

    public Complete(WebDriver driver) {
        this.driver = driver;
    }
}
