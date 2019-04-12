import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.testng.Assert;
import pages.FacebookBasePage;
import pages.FacebookLoginPage;
import pages.FacebookMainPage;

public class Facebook extends StoryBase {

    FacebookBasePage facebookBasePage;
    FacebookMainPage facebookMainPage;
    FacebookLoginPage facebookLoginPage;

    @Given("I open Facebook login page")
    public void openFacebook() {
        facebookBasePage = new FacebookBasePage(driver);
        facebookLoginPage = facebookBasePage.goToFacebook();
    }

    @When("I login with '$email' and '$password'")
    public void loginToFacebook(String email, String password) {
        facebookMainPage = facebookLoginPage.loginToFacebook(email, password);
    }

    @Then("I am on main page as '$userName'")
    public void verifyLoginSuccessful(String userName) {
        Assert.assertEquals(userName, facebookMainPage.getUserName());
    }
}