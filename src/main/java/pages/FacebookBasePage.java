package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookBasePage {
    public WebDriverWait wait;
    public WebDriver driver;
    private String baseURL = "https://www.facebook.com/";

    public FacebookBasePage (WebDriver driver){
        System.setProperty("webdriver.gecko.driver", "/Users/Aliaksandra_Zhykh/geckodriver");
        this.driver = driver;
        this.driver.manage().window().maximize();
        wait = new WebDriverWait(driver,15);
    }

    public FacebookLoginPage goToFacebook (){
        driver.get(baseURL);
        return new FacebookLoginPage(driver);
    }

    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }


}