package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookMainPage extends FacebookBasePage {

    public FacebookMainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement userNavLabel = driver.findElement(By.id("userNav"));

    public String getUserName() {
        waitVisibility(userNavLabel);
        return userNavLabel.getText();
    }

}
