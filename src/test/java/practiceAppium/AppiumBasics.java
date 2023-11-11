package practiceAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.testng.annotations.Test;

public class AppiumBasics {

  @Test
  public void AppiumTest() throws MalformedURLException {
    UiAutomator2Options options = new UiAutomator2Options();
    options
        .setDeviceName("Test Emulator")
        .setApp(
            "/Users/likith/Documents/appium-practice/AppiumPractice/src/test/resources/ApiDemos-debug.apk");
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
  }
}
