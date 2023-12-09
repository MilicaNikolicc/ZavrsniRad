package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class HomePage {
    public WebDriver driver;

    public By productImg = By.xpath("//img[@class=\"inventory_item_img\"]");
    public By productTitle = By.xpath("//div[@class=\"inventory_item_name \"]");
    public By addToCartButton = By.xpath("//button[text()=\"Add to cart\"]");
    public By cartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");
    public By twitterButton = By.xpath("//a[@href=\"https://twitter.com/saucelabs\"]");
    public By facebookButton = By.xpath("//a[@href=\"https://www.facebook.com/saucelabs\"]");
    public By linkedInButton = By.xpath("//a[@href=\"https://www.linkedin.com/company/sauce-labs/\"]");
    public By linkedInLogo = By.xpath("//icon[@data-test-id=\"nav-logo\"]");




    public boolean productImgIsDisplayed (){
        return driver.findElement(productImg).isDisplayed();
    }
    public boolean productTitleIsDisplayed (){
        return driver.findElement(productTitle).isDisplayed();
    }
    public void addToCart (){
        driver.findElement(addToCartButton).click();
    }

    public void clickOnCart(){
        driver.findElement(cartButton).click();
    }


    public void clickOnProductTitle (){
        driver.findElement(productTitle).click();
    }
    public void clickOnTwitter (){
        driver.findElement(twitterButton).click();
    }
    public void clickOnFacebook (){
        driver.findElement(facebookButton).click();
    }
    public void clickOnLinkedIn (){
        driver.findElement(linkedInButton).click();
    }

    public void swichWindow (){
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(currentWindowHandle);
        driver.switchTo().window(windowHandles.iterator().next());
    }


    public boolean isLinkedInLogoDisplayed (){
        return driver.findElement(linkedInLogo).isDisplayed();
    }



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
