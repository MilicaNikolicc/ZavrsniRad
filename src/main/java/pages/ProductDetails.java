package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetails {
    public WebDriver driver;

    public By backButton = By.xpath("//button[@id=\"back-to-products\"]");
    public By prdTitle = By.xpath("//div[@class=\"inventory_details_name large_size\"]");
    public By addButton = By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
    public By cartButton = By.xpath("//div[@id=\"shopping_cart_container\"]");

    public void clickOnAddButton (){
        driver.findElement(addButton).click();
    }
    public void clickOnCartButton (){
        driver.findElement(cartButton).click();
    }
    public String getPrdTitle (){
        return driver.findElement(prdTitle).getText();
    }
    public void clickOnBackButton (){
        driver.findElement(backButton).click();
    }


    public ProductDetails(WebDriver driver) {
        this.driver = driver;
    }
}
