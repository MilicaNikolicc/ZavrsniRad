package appTest;

import org.junit.Assert;
import org.junit.Test;

public class RemoveFromCartTest extends BaseTest{
    @Test
    public void RemovePrd() {
        loginPage.uspesnoLogovanje();
        homePage.addToCart();
        homePage.clickOnCart();
        Assert.assertTrue("Proizvod nije u korpi", yourCart.isCartItemDisplayed());
        yourCart.clickOnRemoveButton();
        Assert.assertFalse("Proizvod nije uklonjen", yourCart.isCartItemDisplayed());
    }


}
