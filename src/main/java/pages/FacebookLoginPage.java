package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FacebookLoginPage extends FacebookBasePage {

    public FacebookLoginPage (WebDriver driver) {
        super(driver);
    }

    private WebElement usernameInput = driver.findElement(By.id("email"));
    private WebElement passwordInput = driver.findElement(By.id("pass"));
    private WebElement loginButton = driver.findElement(By.id("loginbutton"));

    public FacebookMainPage loginToFacebook (String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new FacebookMainPage(driver);
    }
}
