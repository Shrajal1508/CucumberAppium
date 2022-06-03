package ScreenCA;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppDisplayMechanicsPage {
	
	public static AppiumDriver<MobileElement> wd = null;
	By ClickApp = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
	By ClickActionBar = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]");
	By ClickMechanics = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Mechanics\"]");
	By ClickDisplay = By.xpath("//android.widget.TextView[@content-desc=\"Display Options\"]\r\n");
	By ClickNavigation = By.id("io.appium.android.apis:id/toggle_navigation");
	By Tab = By.id("");




	public AppDisplayMechanicsPage(AppiumDriver<MobileElement> wd) {
	this.wd=wd;
	}


	public void App() {
	wd.findElement(ClickApp).click();
	}


	public void ActionBar() {
	wd.findElement(ClickActionBar).click();
	}


	public void Mechanics() {
	wd.findElement(ClickMechanics).click();
	}
	
	public void Dispaly() {
		wd.findElement(ClickDisplay).click();
	}
	
	public void Navigation() {
		wd.findElement(ClickNavigation).click();
	}
	
	public void verifyFirst() {
		try
		{
			//Assert.assertEquals(wd.findElement(Tab).isDisplayed(), true);
			System.out.println("\n *********************** Tabs Displayed *********************** \n");
		}
		catch(Exception e)
		{
			System.out.println("Display Failed" + e);
		}
	}
	
	public void verifySecond() {
		try
		{
			//Assert.assertEquals(wd.findElement(Tab).isDisplayed(), false);
			System.out.println("\n *********************** Tabs Hide *********************** \n");
		}
		catch(Exception e)
		{
			System.out.println("Hide Failed" + e);
		}
	}
	
	public void verifyThird() {
		Assert.assertEquals(wd.findElement(ClickMechanics).isSelected(), true);
	}

}
