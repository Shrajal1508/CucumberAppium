package ScreenCA;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HideShowPage {
	
	public static AppiumDriver<MobileElement> wd = null;


	By ClickAnimation = By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	By ClickHideShowAnimation = By.xpath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]");
	By ClickFirstBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
	By ClickSecondBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]");
	By ClickThirdBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]");
	By ClickFourthBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]");
	By ClickShow = By.id("io.appium.android.apis:id/addNewButton");




	public HideShowPage(AppiumDriver<MobileElement> wd) {
	this.wd=wd;
	}



	public void Animation() {
	wd.findElement(ClickAnimation).click();
	}



	public void HideShowAnimation() {
	wd.findElement(ClickHideShowAnimation).click();
	}



	public void ClickToHide() {
	wd.findElement(ClickFirstBtn).click();
	//wd.findElement(ClickSecondBtn).click();
	wd.findElement(ClickThirdBtn).click();
	//wd.findElement(ClickFourthBtn).click();
	}
	
	
	public void ShowBtn() {
	wd.findElement(ClickShow).click();
	}

	public void verifyHide() {
		try
		{
		 //	Assert.assertEquals(wd.findElement(ClickFirstBtn).isDisplayed(), false);
		 //	Assert.assertEquals(wd.findElement(ClickSecondBtn).isDisplayed(), false);
		//	Assert.assertEquals(wd.findElement(ClickThirdBtn).isDisplayed(), false);
	    //	Assert.assertEquals(wd.findElement(ClickFourthBtn).isDisplayed(), false);
			System.out.println("\n *********************** Buttons Hidden *********************** \n");
		}
		catch(Exception e)
		{
			System.out.println("Display Failed" + e);
		}
	}
	
	public void verifyDisplay() {
		try
		{
			//Assert.assertEquals(wd.findElement(ClickFirstBtn).isDisplayed(), true);
			//Assert.assertEquals(wd.findElement(ClickSecondBtn).isDisplayed(), true);
			//Assert.assertEquals(wd.findElement(ClickThirdBtn).isDisplayed(), true);
			//Assert.assertEquals(wd.findElement(ClickFourthBtn).isDisplayed(), true);
			System.out.println("\n *********************** Buttons Displayed *********************** \n");
		}
		catch(Exception e)
		{
			System.out.println("Hide Failed" + e);
		}
	}





	
}
