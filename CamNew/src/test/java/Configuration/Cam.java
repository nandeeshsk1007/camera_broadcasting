package Configuration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObjects.Components;
import Utilities.ConfigDetails;

public class Cam extends BaseClass {
	@Test
	public void startConfiguring() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Components components = new Components(driver);
		ConfigDetails set = new ConfigDetails();

		driver.get(set.conf(0, 1));

		//Login to Application
		components.login(set.conf(1, 1), set.conf(2, 1));
		Thread.sleep(2000);
		
		//Close modify password tips popup
		components.exitFromTipsPopup();
		Thread.sleep(2000);
		
		//To click on configuration button
		components.configuration();
		Thread.sleep(5000);
		
		//To click on system tab and navigate log search screen	
		components.system();
		
		//To select start date
		components.clickonstartdatefield.click();
		components.clickoncalendarbackbutton.click();
		Thread.sleep(2000);
	}
}