package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import util.LoggerLoad;

import static util.driver.DriverHolder.getDriver;

public class HomepageTest extends BaseTest {

    @Test(priority = 1)
    public void verifyHomePage() {

        LoggerLoad.info("verify HomePage");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .clickLogo()
                .verifyHomePage();
    }

    @Test(priority = 2)
    public void verifyLogo() {
        LoggerLoad.info("verify Logo Present");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .verifyLogoPresent();
    }

    @Test(priority = 3)
    public void verifyHomePageURL() {
        LoggerLoad.info("verify HomePage URL");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .clickLogo()
                .verifyHomePage();
        Assert.assertEquals(getDriver().getCurrentUrl(),
                "https://naveenautomationlabs.com/opencart/index.php?route=common/home");
    }

    @Test(priority = 4)
    public void verifySearchFieldAndButton() {
        LoggerLoad.info("verify Search Field And Button");
        HomePage homePage = new HomePage(getDriver());
        homePage
                .clickLogo()
                .verifySearchFieldAndButton();
    }
}