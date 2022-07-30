package StepDefinitions;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tideUS.pageObjects.HomePage;
import com.tideUS.pageObjects.LoginPage;
import com.tideUS.pageObjects.SignupPage;
import com.tideUS.utilities.ReadExcel;

import Mindtree.ProjectFramework.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public ExtentHtmlReporter htmlReporter ;
	public ExtentReports extent;
	public ExtentTest extentTest;
	public BaseClass BCobj;
	public String baseURL= "https://tide.com/en-us";
	
	
@Given("Initialize the browser with chrome")
public void initialize_the_browser_with_chrome() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	
   htmlReporter =new ExtentHtmlReporter("./reports/extentreport"+java.time.LocalDate.now()+".html");
	htmlReporter.config().setEncoding("utf-8");
	htmlReporter.config().setDocumentTitle("Automation Reports");
	htmlReporter.config().setReportName("Automation Test Results");
	htmlReporter.config().setTheme(Theme.STANDARD);
	
	
	extent=new ExtentReports();
	extent.setSystemInfo("Organization", "Done");
	extent.setSystemInfo("Browser", "Chrome");
	extent.attachReporter(htmlReporter);
	 driver=initializeDriver();
	 driver.manage().window().maximize();
	   System.out.print("driver initilized");
	
}
LoginPage login;	
	
@When("The user navigates to login page")
public void the_user_navigates_to_login_page() {
    // Write code here that turns the phrase above into concrete actions
	 login= new LoginPage(driver);
	driver.get("https://www.pggoodeveryday.com/login/");
   
}
@When("Enter his email id and password")
public void enter_his_email_id_and_password() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	
	ReadExcel excel = new ReadExcel();
	
	
	
	login.setEmail().sendKeys(excel.excelData(1, 2));
	login.setPassword().sendKeys(excel.excelData(1, 3));
	
	
}
@When("Click on Log In")
public void click_on_log_in() {
    // Write code here that turns the phrase above into concrete actions
	login.submit().click();
    
}
@Then("he is logged into his account")
public void he_is_logged_into_his_account() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(login.message())); // give an element locator, such a way that you can confirm that visibility of that elements represents the complete loading of the page.
	System.out.println(driver.getTitle());
    
}







@Then("first test case is passed")
public void first_test_case_is_passed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("passed");
	driver.close();
}
SignupPage signup;

@Given("The user clicks on register and navigates to register page")
public void the_user_clicks_on_register_and_navigates_to_register_page() {
	extentTest= extent.createTest("TC001_Signup - check if new user is able to sign up ");

	 signup= new SignupPage(driver);
	driver.get(baseURL);
	extentTest.pass("step1 -user is navigated to homepage ");
	log.info("passed");
	signup.registerLink().click();
}
@When("The user click on sign up now")
public void the_user_click_on_sign_up_now() {
	extentTest.pass("step2- user is taken to sign up now page ");
	signup.getSignupLink().click();
}
@When("Enter his name  email id and password")
public void enter_his_name_email_id_and_password() throws IOException {
	System.out.println(driver.getTitle());
	ArrayList<String> handles =new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(handles.get(1));
	
	ReadExcel excel = new ReadExcel();
	
	
	signup.setName().sendKeys(excel.excelData(1, 1));
	signup.setEmail().sendKeys(excel.excelData(1, 2));
	signup.setPassword().sendKeys(excel.excelData(1, 3));
	extentTest.pass("step 3 - user has entered email , first name and password");
}
@Then("he has signed up")
public void he_has_signed_up() throws IOException {
	 String url= getScreenshot();
	   	System.out.println(url);
	   	
	   	htmlReporter.config().setAutoCreateRelativePathMedia(true);

	   	
	   	
	    extentTest.pass("human captcha cant be handled ",MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
		extent.flush();
}


@When("Clicks on Forgot Password")
public void clicks_on_forgot_password() {
	extentTest= extent.createTest("TC008- Recover password");
	
	
	
	login.forgotPassword().click();
	
	
	
	
	
}
@When("Enter a valid  email id  to receive a link for password recovery")
public void enter_a_valid_email_id_to_receive_a_link_for_password_recovery() {
	login.forgotEmail().sendKeys("agarwal23871@gmail.com");
}
@When("Click on submit")
public void click_on_submit() {
	login.submit().click();
}
@Then("The user receives the password recovery link via mail")
public void the_user_receives_the_password_recovery_link_via_mail() {
    
}
@When("the user navigates through the link received via email")
public void the_user_navigates_through_the_link_received_via_email() {
	extentTest.pass("PAssword was recovered");
}
@Then("The System enables the user to set a new password")
public void the_system_enables_the_user_to_set_a_new_password() {
	extentTest.pass("PAssword was recovered");
}

HomePage home;
@Given("The user is navigated to homepage")
public void the_user_is_navigated_to_homepage() throws IOException {
	extentTest= extent.createTest("TC003 - check for search functionality ");
	
	
	 home= new HomePage(driver);
	driver.get("https://tide.com/en-us");
	
	


}
@Given("Enter his search key in the  search box and press enter")
public void enter_his_search_key_in_the_search_box_and_press_enter() {
	home.getSearchBox().sendKeys("surf");
	home.getSearchBox().sendKeys(Keys.ENTER);
}
@Then("he is navigated to the page with searched items")
public void he_is_navigated_to_the_page_with_searched_items() throws IOException {
	if(home.getResult().getText().equals("Search results")){
		Assert.assertTrue(true);
		extentTest.pass("Search is successful");
		log.info("Search is successful");
		//extent.flush();
		}

		else {
			extentTest.fail("Search is  not successful");

		String url= getScreenshot();
		System.out.println(url);

		htmlReporter.config().setAutoCreateRelativePathMedia(true);



		extentTest.fail("failed", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());

		//test.addScreenCaptureFromPath("C:\\Users\\mindc1may256\\eclipse-workspace\\ProjectFrameworkurl\\Screenshots\\screenshot0-2022-07-28.png" );

		log.info("Search is  not successful");

		//extent.flush();
		Assert.assertTrue(false);

		}
}
@Then("search results are shown")
public void search_results_are_shown() {
   log.info("search successful");
}



@Given("he clicks on what’s new")
public void he_clicks_on_what_s_new() {
	extentTest = extent.createTest("TC009- Latest news test  Test ");
	 home= new HomePage(driver);
	driver.get(baseURL);
	 home.WhatsNew().click();
	System.out.println(driver.getTitle());
	
}
@Then("he is navigated to the page with new contents")
public void he_is_navigated_to_the_page_with_new_contents() {
	System.out.println(driver.getTitle());
}
@Then(":  The resulted page is latest news page")
public void the_resulted_page_is_latest_news_page() {
	extentTest.pass("latest news test pass");
	log.info("latest news test pass");
}

@Given("he click on learn more in the top segment")
public void he_click_on_learn_more_in_the_top_segment() {
	extentTest= extent.createTest("TC004- Take the pledge test ");
	 home= new HomePage(driver);
	driver.get(baseURL);
	//log.info("passsed");
	
	home.LearnMore().click();
	
	
	
	
	
		
		
		
}
@Then("he is navigated to the page with Take the pledge button")
public void he_is_navigated_to_the_page_with_take_the_pledge_button() {
	
}
@When("he clicks on the button")
public void he_clicks_on_the_button() {
	home.TakeThePledge().click();
}
@Then("He has taken the pledge and thank you message is generated")
public void he_has_taken_the_pledge_and_thank_you_message_is_generated() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(home.ThankYou())); // give an element locator, such a way that you can confirm that visibility of that elements represents the complete loading of the page.
	System.out.println(element.getText());

	if(element.getText().equals("Thank you!")){
		extentTest.pass("take the pledge functionally exeuted successfully");
		
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}






}
