package shradha.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnbordingPage {
WebDriver driver;


	public  OnbordingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='More']")
    WebElement more;
	
	@FindBy(xpath = "//span[text()='Onboarding']")
    WebElement onboard;
	
	
	
	@FindBy(css ="#addItemBtn")
    WebElement button;
	
	
	public void clickOnMore() {
		more.click();
	}
	public void onboardToPage() {
		onboard.click();
		
	}
	public void clickOnAddButton() {
		button.click();
		}

    

	

}
