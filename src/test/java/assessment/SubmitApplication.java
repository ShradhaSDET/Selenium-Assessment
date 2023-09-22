package assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import shradha.orangeHRM.LoginPage;
import shradha.orangeHRM.OnbordingPage;

public class SubmitApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String userName="Admin";
		String password="E31IWcW@nk";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.setCapability("acceptInsecureCerts", true);
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.goTo();
		loginPage.LoginToApp(userName, password);
		Thread.sleep(2000);
		OnbordingPage onbording=new OnbordingPage(driver);
		onbording.clickOnMore();
		onbording.onboardToPage();
		WebDriver fname=driver.switchTo().frame(0);
		onbording.clickOnAddButton();	
		
		}

}
