package Configuration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.InitializeUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	InitializeUtilities initialize=new InitializeUtilities();
	public String camera_ip=initialize.getIP();
	public String username=initialize.getUsername();
	public String password=initialize.getPassword();

	public static WebDriver driver;
	@BeforeMethod
	public void before() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get(camera_ip);
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}

}
