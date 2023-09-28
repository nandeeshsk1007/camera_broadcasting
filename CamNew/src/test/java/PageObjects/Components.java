package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Components {

	//Login
	@FindBy (xpath="//input[@placeholder=\"User Name\"]")
	private WebElement Username;
	@FindBy (xpath="//input[@placeholder=\"Password\"]")
	private WebElement Password;
	@FindBy (xpath="//button[@id=\"btnLogin\"]")
	private WebElement loginbutton;

	//To exit from modify password screen
	@FindBy (xpath="//input[@value='60 Minutes later modified']")
	private WebElement exitbutton;

	//TO click on configuration button
	@FindBy (xpath = "//a[.='Configuration']")
	private WebElement configbutton;

	//To click on system tab and System configuration search screen	
	@FindBy (xpath = "//a[.=' System ']")
	private WebElement systemtab;
	@FindBy (xpath = "(//a[.='Log Search'])[1]")
	private WebElement logsearchbutton;

	//To select start date
	@FindBy (xpath="//input[@class='time J-begin-time hasDatepicker']")
	public WebElement clickonstartdatefield;
	@FindBy (xpath="//a[@class='ui-datepicker-prev ui-corner-all ui-state-hover ui-datepicker-prev-hover']")
	public WebElement clickoncalendarbackbutton;
	@FindBy (xpath="//div[@class='ui-datepicker-title']")
	private WebElement monthandyear;
	
	public Components(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//Login
	public void login(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		Username.sendKeys(username);
		Thread.sleep(1000);
		Password.sendKeys(password);
		Thread.sleep(1000);
		loginbutton.click();
	}

	//To exit from modify password screen
	public void exitFromTipsPopup() throws InterruptedException {
		Thread.sleep(1000);
		exitbutton.click();
	}

	//To click on configuration
	public void configuration() throws InterruptedException {
		Thread.sleep(10000);
		configbutton.click();
		Thread.sleep(10000);
	}

	//To click on system tab and navigate log search screen	
	public void system() throws InterruptedException {
		Thread.sleep(1000);
		systemtab.click();
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(1000);
	}
}
