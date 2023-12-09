package appTest;

import org.junit.Assert;
import org.junit.Test;

public class AddToCartTest extends BaseTest{
    @Test
    public void addPrdToCart() {
        loginPage.uspesnoLogovanje();
        homePage.clickOnProductTitle();
        productDetails.clickOnAddButton();
        String Title = productDetails.getPrdTitle();
        productDetails.clickOnCartButton();
        String TitleInCart = yourCart.getPrdTitle();
        Assert.assertTrue("proizvod nije dodat",Title.equals(TitleInCart));
        Assert.assertEquals("proizvod nije dodat",
                true,
                yourCart.isOneProductInCartPresent());
    }

}
