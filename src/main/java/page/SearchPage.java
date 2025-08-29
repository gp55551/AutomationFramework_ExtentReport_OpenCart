package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static util.CommonMethods.*;
import static util.driver.DriverHolder.getDriver;

public class SearchPage extends BasePage {

    private final By firstLink = By.xpath("//h4/a[1]");
    private final By addToCartButton = By.xpath("//*[text()='Add to Cart']");
    private final By heartButton = By.xpath("//*[@class='fa fa-heart']");
    private final By exchangeButton = By.xpath("//*[@class='fa fa-exchange']");


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage verifyProductDisplayed(String text)
    {
        Assert.assertTrue(driver.findElement(firstLink).getText().contains(text));
        return this;
    }

    public SearchPage verifyAddToCartDisplayed()
    {
        verifyElementDisplayed(driver, addToCartButton);
        return this;
    }

    public SearchPage verifyHeartButtonDisplayed()
    {
        verifyElementDisplayed(driver, heartButton);
        return this;
    }

    public SearchPage verifyExchangeButtonDisplayed()
    {
        verifyElementDisplayed(driver, exchangeButton);
        return this;
    }
}