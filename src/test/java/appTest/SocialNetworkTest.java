package appTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;


public class SocialNetworkTest extends BaseTest{

    @Test
    public void TwitterTest() throws InterruptedException {
        loginPage.uspesnoLogovanje();
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
        homePage.clickOnTwitter();
        Thread.sleep(15000);

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(currentWindowHandle);
        driver.switchTo().window(windowHandles.iterator().next());

        String x = driver.getCurrentUrl();
        String y = "https://twitter.com/saucelabs";
        Assert.assertTrue("Neuspešno otvaranje Twitter linka", x.equals(y));
        System.out.println("URL otvorene strane je " + x);
        System.out.println("Očekivan URL je "+y);
        Thread.sleep(10000);

        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(currentWindowHandle);

    }

    @Test
    public void facebookTest() throws InterruptedException {
        loginPage.uspesnoLogovanje();
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
        homePage.clickOnFacebook();
        Thread.sleep(15000);

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(currentWindowHandle);
        driver.switchTo().window(windowHandles.iterator().next());

        String x = driver.getCurrentUrl();
        Thread.sleep(1000);
        String y = "https://www.facebook.com/saucelabs";
        Assert.assertTrue("Neuspešno otvaranje Facebook linka", x.equals(y));
        System.out.println("URL otvorene strane je " + x);
        System.out.println("Očekivan URL je "+y);

        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(currentWindowHandle);

    }

    @Test
    public void linkedInTest() throws InterruptedException {
        loginPage.uspesnoLogovanje();
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
        homePage.clickOnLinkedIn();
        Thread.sleep(15000);

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(currentWindowHandle);
        driver.switchTo().window(windowHandles.iterator().next());

        Assert.assertTrue("Nije otvoren LikedIn", homePage.isLinkedInLogoDisplayed());
        Thread.sleep(5000);

        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(currentWindowHandle);

    }

}
