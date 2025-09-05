package engine;

import com.shaft.driver.SHAFT;

public class DriverEngine {



    private static final ThreadLocal<SHAFT.GUI.WebDriver> driverThreadLocal = new ThreadLocal<>();


    public static void set() {
        driverThreadLocal.set(new SHAFT.GUI.WebDriver());
    }

    public static SHAFT.GUI.WebDriver get() {
        return driverThreadLocal.get();
    }

    public static void quit() {
        driverThreadLocal.get().quit();
        driverThreadLocal.remove();
    }



}
