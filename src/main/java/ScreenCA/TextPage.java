package ScreenCA;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class TextPage {

	
	
	public static AppiumDriver<MobileElement> wd = null;
	By ClickText=By.xpath("//android.widget.TextView[@content-desc=\"Text\"]");
	By ClickKeyEventText=By.xpath("//android.widget.TextView[@content-desc=\"KeyEventText\"]");
	By EnterKey=By.id("io.appium.android.apis:id/text");
	By ClickClear=By.xpath("//android.widget.Button[@content-desc=\"Clear\"]");




	public TextPage(AppiumDriver<MobileElement> wd) {
	this.wd=wd;
	}

	public void text() {
	wd.findElement(ClickText).click();
	}

	public void keyeventText() {
	wd.findElement(ClickKeyEventText).click();
	}

	public void enterkey(String text ) {
	wd.findElement(EnterKey).sendKeys(text);
	}

	public void clear() {
	wd.findElement(ClickClear).click();
	}


}
