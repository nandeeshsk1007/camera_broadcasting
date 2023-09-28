package Configuration;

import org.testng.annotations.Test;

import PageObjects.Components;

public class Cam extends BaseClass {
	@Test
	public void startConfiguring() throws InterruptedException
	{
		Components components = new Components(driver);
		
		//Login to Application
		components.login(username, password);

		//Close modify password tips popup
		components.exitFromTipsPopup();

		//To click on configuration button
		components.configuration();

		//To click on system tab and navigate log search screen	
		components.system();
	}
}