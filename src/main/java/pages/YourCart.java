package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCart {
    public WebDriver driver;

    public By checkoutButton = By.xpath("//button[@id=\"checkout\"]");
    public By productTitle = By.xpath("//div[@class=\"inventory_item_name\"]");
    public By oneProductInCart = By.xpath("//span[text()=\"1\"]");
    public By removeButton = By.xpath("//button[text()=\"Remove\"]");
    public By cartItem = By.xpath("//div[@class=\"cart_item\"]");


    public void clickCheckoutButton (){
        driver.findElement(checkoutButton).click();
    }
    public String getPrdTitle (){
        return driver.findElement(productTitle).getText();
    }
    public boolean isOneProductInCartPresent (){
        return driver.findElement(oneProductInCart).isDisplayed();
    }
    public void clickOnRemoveButton (){
        driver.findElement(removeButton).click();
    }
    public boolean isCartItemDisplayed (){
        return driver.findElement(cartItem).isDisplayed();
    }



    public YourCart(WebDriver driver) {
        this.driver = driver;
    }
}
