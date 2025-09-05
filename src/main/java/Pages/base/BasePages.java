package Pages.base;

import com.shaft.driver.SHAFT;
import engine.DriverEngine;

public abstract class BasePages {




    public SHAFT.GUI.WebDriver driverEngine() {
        return DriverEngine.get();
    }

}
