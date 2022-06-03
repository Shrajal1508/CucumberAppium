package StepDefinitionCA;

import BaseCA.Base;
import HooksApplied.Hooks;
import ScreenCA.DateTimePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DateTimeStep extends Base {
//	public static AppiumDriverLocalService se;
    Hooks rn=new Hooks();
	
	@Given("^API demos application is open$")
	public void api_demos_application_is_open() throws Throwable {
//		se = AppiumDriverLocalService.buildDefaultService();
//		se.start();
		rn.log.info("*************** Server Started ***************");
		Base.setup();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
	}

	@When("^Clicked on Views$")
	public void clicked_on_Views() throws Throwable {
		DateTimePage HitView=new DateTimePage(wd);
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");	
		HitView.View();
		//Thread.sleep(20000);
		
	}

	@When("^Clicked on Date Widgets$")
	public void clicked_on_Date_Widgets() throws Throwable {
		DateTimePage HitDateWidgets=new DateTimePage(wd);
		HitDateWidgets.DateWidgets();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Clicked on Dialog$")
	public void clicked_on_Dialog() throws Throwable {
		DateTimePage HitDialog=new DateTimePage(wd);
		HitDialog.Dialog();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Click on Change the Date$")
	public void click_on_Change_the_Date() throws Throwable {
		DateTimePage HitDate=new DateTimePage(wd);
		HitDate.ChangeDate();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Change the Date$")
	public void change_the_Date() throws Throwable {
		DateTimePage Date=new DateTimePage(wd);
		Date.SetDate();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^Verify the changed date$")
	public void verify_the_changed_date() throws Throwable {
		DateTimePage CheckDate=new DateTimePage(wd);
		CheckDate.VerifyDate();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

	@When("^Click on Change the Time$")
	public void click_on_Change_the_Time() throws Throwable {
		DateTimePage HitTime=new DateTimePage(wd);
		HitTime.ChangeTime();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

	@When("^Change the Time$")
	public void change_the_Time() throws Throwable {
		DateTimePage Time=new DateTimePage(wd);
		Time.SetTime();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

	@Then("^Verify the changed time$")
	public void verify_the_changed_time() throws Throwable {
		DateTimePage CheckTime=new DateTimePage(wd);
		CheckTime.VerifyTime();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
		
	}

}


