package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Base64Class;
import util.PropertyFileReader;

import static util.CommonMethods.*;

public class SignInPage extends BasePage {

    private final By signInHeader = By.xpath("//h2[contains(text(),'Returning Customer')]");
    private final By enterEmailField = By.id("input-email");
    private final By enterPasswordField = By.id("input-password");
    private final By loginButton = By.xpath("//input[@value='Login']");
    private final By forgottenPassword = By.xpath("//*[text()='Forgotten Password']");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage verifySignInHomepage() {
        verifyElementDisplayed(driver, signInHeader);
        return this;
    }

    public SignInPage verifyFields() {
        verifyElementDisplayed(driver, enterEmailField);
        verifyElementDisplayed(driver, enterPasswordField);
        return this;
    }

    public SignInPage verifyForgottenPasswordDisplayed() {
        verifyElementDisplayed(driver, forgottenPassword);
        return this;
    }

    public SignInPage loginToAccount() {
        sendKeys(driver, enterEmailField, Base64Class.decryptPassword(PropertyFileReader.getProperty("username")));
        sendKeys(driver, enterPasswordField, Base64Class.decryptPassword(PropertyFileReader.getProperty("password")));
        click(driver, loginButton);
        return this;
    }
}