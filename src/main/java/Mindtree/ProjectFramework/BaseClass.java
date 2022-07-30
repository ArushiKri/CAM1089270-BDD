package Mindtree.ProjectFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass{
	
	public static WebDriver driver;
	public  Properties prop;
	
	
	public static int count=0;
	
	public WebDriver initializeDriver() throws IOException {
	
	 prop = new Properties();
	 
	FileInputStream fis = new FileInputStream("C:\\Users\\mindc1may256\\eclipse-workspace\\ProjectFramework\\Configuration\\config.properties");
	prop.load(fis);
	
	String browser = prop.getProperty("browser");
	
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	public String getScreenshot() throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest= new File("C:\\Users\\mindc1may256\\eclipse-workspace\\ProjectFramework\\Screenshots\\screenshot" + count +"-"+java.time.LocalDate.now()+".png");
		FileUtils.copyFile(src, dest);
		String spath="C:\\Users\\mindc1may256\\eclipse-workspace\\ProjectFramework\\Screenshots\\screenshot"+count+"-"+java.time.LocalDate.now()+".png";
		count++;
		
		return spath;
	}
	

}
