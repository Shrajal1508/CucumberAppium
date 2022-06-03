package BaseCA;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	
	public static AppiumDriver<MobileElement> wd = null;

	public static void setup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("app", "C:/Users/shrajalsingh/Downloads/ApiDemos-debug.apk");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabilities.setCapability("deviceName", "Android");
		
		// For Headless Mode
		//capabilities.setCapability("isHeadless", true);

		try {

			wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
