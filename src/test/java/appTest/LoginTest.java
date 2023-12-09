package appTest;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void validUsernameInvalidPassword() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword(String.valueOf(faker.random()));
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Nije prikazana poruka o grešci",loginPage.isErrorMsgWrongDataDisplayed());
    }

    @Test
    public void invalidUsernameValidPassword() {
        loginPage.enterUserName(String.valueOf(faker.random()));
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Nije prikazana poruka o grešci",loginPage.isErrorMsgWrongDataDisplayed());
    }

    @Test
    public void invalidUsernameInvalidPassword() {
        loginPage.enterUserName(String.valueOf(faker.random()));
        loginPage.enterPassword(String.valueOf(faker.random()));
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Nije prikazana poruka o grešci",loginPage.isErrorMsgWrongDataDisplayed());
    }

    @Test
    public void validUsernameNoPassword() {
        loginPage.enterUserName("standard_user");
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Nije prikazana poruka o grešci",loginPage.isErrorMsgNoPasswordDisplayed());
    }

    @Test
    public void NoUsernameValidPassword() {
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Nije prikazana poruka o grešci",loginPage.isErrorMsgNoUsernameDisplayed());
    }

    @Test
    public void NoUsernameNoPassword() {
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Nije prikazana poruka o grešci",loginPage.isErrorMsgNoUsernameDisplayed());
    }

    @Test
    public void validLoginAction() throws InterruptedException {
        loginPage.uspesnoLogovanje();
        Thread.sleep(10000);
        Assert.assertTrue("Nije uspesno logovanje", homePage.productImgIsDisplayed());
        Assert.assertTrue("Nije uspesno logovanje", homePage.productTitleIsDisplayed());
    }



}
