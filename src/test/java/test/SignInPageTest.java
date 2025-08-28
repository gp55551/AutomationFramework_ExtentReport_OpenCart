package test;

import org.testng.annotations.Test;
import page.SignInPage;
import util.LoggerLoad;

import static util.driver.DriverHolder.getDriver;

public class SignInPageTest extends BaseTest {

    @Test(priority = 1)
    public void verifySignInPage() {
        LoggerLoad.info("verify Sign In Page");

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage
                .verifySignInHomepage();
    }

    @Test(priority = 2)
    public void verifySignInFields() {
        LoggerLoad.info("verify Sign In Fields");

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage
                .verifySignInHomepage()
                .verifyFields();
    }

    @Test(priority = 3)
    public void verifyForgottenPasswordPresent() {
        LoggerLoad.info("verify Forgotten Password Present");

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage
                .verifySignInHomepage()
                .verifyForgottenPasswordDisplayed();
    }

    @Test(priority = 4)
    public void loginToAccount() {
        LoggerLoad.info("log in To Account");

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage
                .verifySignInHomepage()
                .loginToAccount();
    }
}