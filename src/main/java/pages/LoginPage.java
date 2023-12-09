package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    public By userNameInputFiled = By.xpath("//input[@id=\"user-name\"]");
    public By passwordInputField = By.xpath("//input[@id=\"password\"]");
    public By loginButton = By.xpath("//input[@id=\"login-button\"]");
    public By errorMsgNoUsername = By.xpath("//*[text()=\"Epic sadface: Username is required\"]");
    public By errorMsgNoPassword = By.xpath("//*[text()=\"Epic sadface: Password is required\"]");
    public By errorMsgWrongData = By.xpath("//*[text()=\"Epic sadface: Username and password do not match any user in this service\"]");


    public void enterUserName (String userName){
        driver.findElement(userNameInputFiled).sendKeys(userName);
    }
    public void enterPassword (String password){
        driver.findElement(passwordInputField).sendKeys(password);
    }
    public void clickOnLoginButton (){
        driver.findElement(loginButton).click();
    }
    public void uspesnoLogovanje (){
        driver.findElement(userNameInputFiled).sendKeys("standard_user");
        driver.findElement(passwordInputField).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }
    public boolean isErrorMsgNoUsernameDisplayed (){
        return driver.findElement(errorMsgNoUsername).isDisplayed();
    }
    public boolean isErrorMsgNoPasswordDisplayed (){
        return driver.findElement(errorMsgNoPassword).isDisplayed();
    }
    public boolean isErrorMsgWrongDataDisplayed (){
        return driver.findElement(errorMsgWrongData).isDisplayed();
    }




    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}
