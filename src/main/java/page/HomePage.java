package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static util.CommonMethods.*;
import static util.driver.DriverHolder.getDriver;

public class HomePage extends BasePage {

    private final By logo = By.id("logo");
    private final By searchField = By.xpath("//*[@name='search']");
    private final By searchButton = By.xpath("//*[@name='search']/following::button[1]");
    private final String homePageURL = "https://naveenautomationlabs.com/opencart/index.php?route=common/home";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickLogo()
    {
        click(driver, logo);
        return this;
    }

    public HomePage verifyLogoPresent()
    {
        verifyElementDisplayed(driver, logo);
        return this;
    }

    public HomePage verifyHomePage()
    {
        Assert.assertEquals(getDriver().getCurrentUrl(), homePageURL);
        return this;
    }

    public HomePage verifySearchFieldAndButton()
    {
        verifyElementDisplayed(driver, searchField);
        verifyElementDisplayed(driver, searchButton);
        return this;
    }

    public SearchPage searchProduct(String text)
    {
        sendKeys(driver, searchField,text);
        click(driver, searchButton);
        return new SearchPage(driver);
    }
}