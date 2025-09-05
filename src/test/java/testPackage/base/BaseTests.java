package testPackage.base;

import Pages.Login.LoginPage;
import com.shaft.driver.SHAFT;
import engine.DriverEngine;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTests {



    @BeforeMethod
    public void setup(){
       DriverEngine.set();
        new LoginPage().LoginUsingValidData();
    }

    @AfterMethod
    public void tearDown(){
      DriverEngine.quit();
    }
}
