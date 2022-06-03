package StepDefinitionCA;

import BaseCA.Base;
import HooksApplied.Hooks;
import ScreenCA.TextPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TextStep extends Base {
	
	Hooks rn = new Hooks();
	@Given("^App is started$")
	public void app_is_started() throws Throwable {
//		se = AppiumDriverLocalService.buildDefaultService();
//		se.start();
		rn.log.info("*************** server started ***************");
		Base.setup();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		Thread.sleep(20000);
	}

	@Given("^Click on Text$")
	public void click_on_Text() throws Throwable {
		TextPage firstclick=new TextPage(wd);
		firstclick.text();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Given("^Click on KeyEventText$")
	public void click_on_KeyEventText() throws Throwable {
		TextPage secondclick=new TextPage(wd);
		secondclick.keyeventText();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Given("^Enter Text \"([^\"]*)\"$")
	public void enter_Text(String arg1) throws Throwable {
		TextPage Third=new TextPage(wd);
		Third.enterkey(arg1);
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}

	@Then("^click on clear$")
	public void click_on_clear() throws Throwable {
		TextPage fifthclick=new TextPage(wd);
		fifthclick.clear();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		rn.log.info("***************" +nameofCurrMethod+ " has started ***************");
		//Thread.sleep(20000);
	}
}
