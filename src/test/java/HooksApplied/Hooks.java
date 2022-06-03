package HooksApplied;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import UtilityCA.Screenshots;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Hooks {
	
	public static ExtentReports extent;
	public  ExtentTest extentTest;
	public  Logger log = Logger.getLogger(Hooks.class);
	public static AppiumDriver<MobileElement> wd = null;
	protected static AppiumDriverLocalService se;
	
	
	// Report Initialized
	@Before 
	public void setExtent() {
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}
	
	@Before
	public void startlog() {
		PropertyConfigurator.configure("./Resources/log4j.properties");
		log.info("**************** LOG STARTED ****************");
	}
	
	// Appium server
//	@Before
//	public void startAppium() {
//		se = AppiumDriverLocalService.buildDefaultService();
//		se.start();
//	}
	
	// Report Start
	public void startTest(String method) {
		String testName = method;
		extentTest = extent.startTest(testName);
	}
	
	
	//Report End
	@After
	public void endtest() {
		extent.endTest(extentTest);
		
	}
	
	@After
	public void endlog() {
		log.info("**************** LOG ENDED **************** \n");
	}
	
	
	//Screenshot
//	@After
//	public void attachScreenshot(ITestResult result) {
//
//		if (result.getStatus() == ITestResult.FAILURE) {
//			String scrPath = Screenshots.captureScreenshot(wd, result.getName());
//			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(scrPath));
//		}
//	}
	
	
	//Report Close
	@After
	public void endReport() {
		extent.flush();
		extent.close();
	}
	

}
