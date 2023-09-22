package shradha.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventCreationPage {
	WebDriver driver;
	public  EventCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "OhrmJob_name")
    WebElement eventName;
	
	@FindBy(css = ".select-dropdown")
    WebElement dropdown;
	
	@FindBy(id = "jobDueDate")
    WebElement dueDate;
	
	@FindBy(id = "OhrmJob_newHires")
    WebElement participant;
	
	@FindBy(id = "OhrmJob_owners")
    WebElement owner;
	
	@FindBy(id="createButton")
	WebElement createButton;
	
	public String setdetails() {
		String name="Shradha-Onboard";
		String Participant= "Shradha automation";
		String owner= "Shradha automation";
		return name;
		
			}
	public void details(String eventName,String participant,String owner) {
		
		
	}


}
