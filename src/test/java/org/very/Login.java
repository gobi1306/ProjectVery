package org.very;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	@Test
	private void log() {
		chromeBrowser();
		getUrl("https://www.very.co.uk/");
		 PomVery p=new PomVery();
		 WebElement accoutBtn = p.getAccoutBtn();
          click(accoutBtn);
		 

	}

}
