package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import util.LoggerLoad;

import static util.driver.DriverHolder.getDriver;

public class SearchProductTest extends BaseTest {

    @Test(priority = 1)
    public void searchProductAndVerifyDisplayed() {

        LoggerLoad.info("search Product And Verify Displayed");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .searchProduct("iPhone")
                .verifyProductDisplayed("iPhone");
    }

    @Test(priority = 2)
    public void verifyAddToCartButtonPresent() {

        LoggerLoad.info("verify Add To Cart Button Present");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .searchProduct("iPhone")
                .verifyAddToCartDisplayed();
    }

    @Test(priority = 3)
    public void verifyHeartButtonPresent() {

        LoggerLoad.info("verify Heart Button Present");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .searchProduct("iPhone")
                .verifyHeartButtonDisplayed();
    }

    @Test(priority = 4)
    public void verifyExchangeButtonPresent() {

        LoggerLoad.info("verify Exchange Button Present");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .searchProduct("iPhone")
                .verifyExchangeButtonDisplayed();
    }


}