package Pages.Login;

import Pages.base.BasePages;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LoginPage extends BasePages {
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Login.json");


    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.className("btn-success");
    By switchEnglishButton = By.id("language-switcher");

    public LoginPage LoginUsingValidData() {
        driverEngine().browser().navigateToURL(testData.getTestData("baseUrl"));
        driverEngine().element().click(switchEnglishButton);
        driverEngine().element().type(usernameField, testData.getTestData("userName"));
        driverEngine().element().type(passwordField, testData.getTestData("password"));
        driverEngine().element().click(loginButton);
        return this;
    }

    public LoginPage assertTheTitle() {
        driverEngine().assertThat().browser().title().isEqualTo("Admin | Dashboard");
        return this;
    }

}
