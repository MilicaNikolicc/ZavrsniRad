package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfo {
    public WebDriver driver;

    public By fistNameInputField = By.xpath("//input[@id=\"first-name\"]");
    public By lastNameInputField = By.xpath("//input[@id=\"last-name\"]");
    public By zipCodeInputFiled = By.xpath("//input[@id=\"postal-code\"]");
    public By continueButton = By.xpath("//input[@id=\"continue\"]");


    public void   enterFirstName (String firstName){
       driver.findElement(fistNameInputField).sendKeys(firstName);
    }
    public void enterLastName (String lastName){
        driver.findElement(lastNameInputField).sendKeys(lastName);
    }
    public void enterZipCode (String zipCode){

        driver.findElement(zipCodeInputFiled).sendKeys(zipCode);
    }
    public void clickContinueButton (){
        driver.findElement(continueButton).click();
    }

    public CheckoutInfo(WebDriver driver) {
        this.driver = driver;
    }
}
