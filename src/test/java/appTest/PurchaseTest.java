package appTest;

import org.junit.Assert;
import org.junit.Test;

public class PurchaseTest extends BaseTest{

    @Test
    public void purchase() throws InterruptedException {
        loginPage.uspesnoLogovanje();
        homePage.addToCart();
        homePage.clickOnCart();
        Thread.sleep(5000);
        yourCart.clickCheckoutButton();
        Thread.sleep(5000);
        checkoutInfo.enterFirstName(String.valueOf(faker.name().firstName()));
        checkoutInfo.enterLastName(String.valueOf(faker.name().lastName()));
        checkoutInfo.enterZipCode(String.valueOf(faker.address().zipCode()));
        Thread.sleep(5000);
        checkoutInfo.clickContinueButton();
        Thread.sleep(5000);
        overview.clickOnFinishButton();
        Assert.assertTrue("nije uspešna kupovina",complete.isCheckoutCompleteDisplayed() && complete.isThankYouMsgDisplayed());
    }

}
