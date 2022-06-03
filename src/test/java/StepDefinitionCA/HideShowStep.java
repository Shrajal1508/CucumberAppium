package StepDefinitionCA;

import BaseCA.Base;
import HooksApplied.Hooks;
import ScreenCA.AppDisplayMechanicsPage;
import ScreenCA.HideShowPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class HideShowStep extends Base{
	
	Hooks rn=new Hooks();
	public static AppiumDriverLocalService se;
	//RunnerAPI rn=new RunnerAPI();
	
	@Given("^API demos apk Initialised$")
	public void api_demos_apk_Initialised() throws Throwable {
//		se = AppiumDriverLocalService.buildDefaultService();
//		se.start();
		rn.log.info("*************** Server Started ***************");
		Base.setup();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
	}

	@When("^Clicked on Animation$")
	public void clicked_on_Animation() throws Throwable {
		HideShowPage ClickAnim=new HideShowPage(wd);
		ClickAnim.Animation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Clicked on Hide-Show Animation$")
	public void clicked_on_Hide_Show_Animation() throws Throwable {
		HideShowPage ClickHideShow=new HideShowPage(wd);
		ClickHideShow.HideShowAnimation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Clicked on buttons to hide$")
	public void clicked_on_buttons_to_hide() throws Throwable {
		HideShowPage Hide=new HideShowPage(wd);
		Hide.ClickToHide();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^Validate the buttons are hidden$")
	public void validate_the_buttons_are_hidden() throws Throwable {
		HideShowPage CheckHide=new HideShowPage(wd);
		CheckHide.verifyHide();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

	@When("^Clicked on show buttons$")
	public void clicked_on_show_buttons() throws Throwable {
		HideShowPage Show=new HideShowPage(wd);
		Show.ShowBtn();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^Verify the btns are shown$")
	public void verify_the_btns_are_shown() throws Throwable {
		HideShowPage CheckShow=new HideShowPage(wd);
		CheckShow.verifyDisplay();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

}
