package shradha.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id = "txtUsername")
    WebElement userName;

    @FindBy(id = "txtPassword")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    
    public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void goTo() {
		driver.get("https://narayantomar47-trials710.orangehrmlive.com/client/#/dashboard");
	}
	public void LoginToApp(String uname,String pword) {
		userName.sendKeys(uname);
        password.sendKeys(pword);
        submit.click();
		
	}

	


}
