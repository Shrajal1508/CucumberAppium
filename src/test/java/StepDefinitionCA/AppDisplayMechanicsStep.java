package StepDefinitionCA;

import BaseCA.Base;
import HooksApplied.Hooks;
import ScreenCA.AppDisplayMechanicsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppDisplayMechanicsStep extends Base{

	Hooks rn=new Hooks();
	
	@Given("^API demos started$")
	public void api_demos_started() throws Throwable {
//		se = AppiumDriverLocalService.buildDefaultService();
//		se.start();
		rn.log.info("*************** server started ***************");
		Base.setup();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
	}

	@When("^Clicked on App$")
	public void clicked_on_App() throws Throwable {
		AppDisplayMechanicsPage HitApp=new AppDisplayMechanicsPage(wd);
		HitApp.App();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Clicked on Action Bar$")
	public void clicked_on_Action_Bar() throws Throwable {
		AppDisplayMechanicsPage Action=new AppDisplayMechanicsPage(wd);
		Action.ActionBar();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Clicked on Display Options$")
	public void clicked_on_Display_Options() throws Throwable {
		AppDisplayMechanicsPage DisplayFeature=new AppDisplayMechanicsPage(wd);
		DisplayFeature.Dispaly();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@When("^Clicked on Navigation$")
	public void clicked_on_Navigation() throws Throwable {
		AppDisplayMechanicsPage NavigationTab=new AppDisplayMechanicsPage(wd);
		NavigationTab.Navigation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^Validated Multiple Tabs Shown$")
	public void validated_Multiple_Tabs_Shown() throws Throwable {
		AppDisplayMechanicsPage Check1=new AppDisplayMechanicsPage(wd);
		Check1.verifyFirst();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

	@When("^Again Navigation hitted$")
	public void again_Navigation_hitted() throws Throwable {
		AppDisplayMechanicsPage AgnNavigationTab=new AppDisplayMechanicsPage(wd);
		AgnNavigationTab.Navigation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^Validated Multiple Tabs Hide$")
	public void validated_Multiple_Tabs_Hide() throws Throwable {
		AppDisplayMechanicsPage Check2=new AppDisplayMechanicsPage(wd);
		Check2.verifySecond();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

	@When("^Clicked on Action Bar Mechanics$")
	public void clicked_on_Action_Bar_Mechanics() throws Throwable {
		AppDisplayMechanicsPage MechanicsFeature=new AppDisplayMechanicsPage(wd);
		MechanicsFeature.Mechanics();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^Validated Mechanics Page View$")
	public void validated_Mechanics_Page_View() throws Throwable {
		AppDisplayMechanicsPage Check3=new AppDisplayMechanicsPage(wd);
		Check3.verifyThird();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(2000);
	}

}
