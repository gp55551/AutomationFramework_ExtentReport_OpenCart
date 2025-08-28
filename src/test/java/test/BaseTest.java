package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.BasePage;
import util.LoggerLoad;
import util.driver.DriverFactory;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;

public class BaseTest {

    @BeforeMethod
    public void before() {
        setDriver(DriverFactory.getNewDriverInstance(getProperty("browser")));
        getDriver().manage().window().maximize();
        LoggerLoad.info("Stating Application.........");
        getDriver().get(getProperty("application_url"));
        BasePage.clickContinueShopping(getDriver());

    }

    @AfterMethod
    public void after(ITestResult result) {
        if (getDriver() != null) {
            getDriver().quit();
            LoggerLoad.info("Closing Application.........");
        }
    }
}