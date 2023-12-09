package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview {
    public WebDriver driver;

    public By finishButton = By.xpath("//button[@id=\"finish\"]");

    public void clickOnFinishButton (){
        driver.findElement(finishButton).click();
    }



    public Overview(WebDriver driver) {
        this.driver = driver;
    }
}
