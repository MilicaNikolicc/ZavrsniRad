package appTest;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;


public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();

    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);

    }

    public Faker faker = new Faker();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    ProductDetails productDetails = new ProductDetails(driver);
    YourCart yourCart = new YourCart(driver);
    CheckoutInfo checkoutInfo = new CheckoutInfo(driver);
    Overview overview = new Overview(driver);
    Complete complete = new Complete(driver);



}
