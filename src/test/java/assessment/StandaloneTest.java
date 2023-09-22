package assessment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StandaloneTest {

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
		driver.get("https://narayantomar47-trials710.orangehrmlive.com/client/#/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	driver.findElement(By.xpath("//span[text()='More']")).click();
	driver.findElement(By.xpath("//span[text()='Onboarding']")).click();
	driver.findElement(By.id("noncoreIframe"));
	
	WebDriver fname=driver.switchTo().frame(0);
	fname.findElement(By.cssSelector("#addItemBtn")).click();
	

	driver.findElement(By.id("OhrmJob_name")).sendKeys("Shradha-Onboard");
	 driver.findElement(By.cssSelector(".select-dropdown")).click();
	 driver.findElement(By.id("jobDueDate")).click();
	driver.findElement(By.id("OhrmJob_newHires")).sendKeys("Shradha automation");
	
	driver.findElement(By.id("OhrmJob_owners")).sendKeys("Shradha Khaire");
	
	
	
	
	

	
	
	
	
	
	
	
	

	
	}

}
