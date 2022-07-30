/*package Mindtree.ProjectFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import junit.framework.Assert;

public class HomePage  extends BaseClass{
	
	
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public ExtentHtmlReporter htmlReporter ;
	public ExtentReports extent;
	public ExtentTest extentTest;
	public BaseClass BCobj;
	
	
	@BeforeSuite
	public void beforeClass() {
		
		htmlReporter =new ExtentHtmlReporter("./reports/extentreport"+java.time.LocalDate.now()+".html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Reports");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
		extent=new ExtentReports();
		extent.setSystemInfo("Organization", "Done");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);
		
		
	}
	
	@BeforeClass
	public void initialize() throws IOException {
		
        driver=initializeDriver();
        log.info("Driver is intialized!");
		
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the site ");
		
		
	}
	
	
}*/
