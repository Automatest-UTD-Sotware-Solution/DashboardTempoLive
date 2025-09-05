package testPackage.Login;

import Pages.Login.LoginPage;
import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;
import testPackage.base.BaseTests;

public class LoginTests extends BaseTests {

    @Test
    public void verifyLoginSuccessfully(){
        new LoginPage().assertTheTitle();
    }
}
