package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Cloud implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        // Set your access credentials
        caps.setCapability("browserstack.user", "denissekatherine_VRHAZ6");
        caps.setCapability("browserstack.key", "R9nH9cyKdCyraNt3sg7b");

        // Set URL of the application under test
        caps.setCapability("app", "bs://8e63260989b671c1bca9082a29097378e5bde8ca");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "JB Group");
        caps.setCapability("build", "1.0");
        caps.setCapability("name", "whenDo");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver driver = new AndroidDriver(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }
}
