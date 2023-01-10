package org.very;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccout extends BaseClass {
	@BeforeClass
	private void browserla() {
		System.out.println("beforeclass");
		chromeBrowser();
		getUrl("https://www.very.co.uk/");
		driver.findElement(By.xpath("//button[@class='cookieMessage__button']")).click();

		

	}

	@AfterClass
	private void afte() {

		System.out.println("afterclass");
		//driver.quit();

	}

	@Test(priority = -1)
	private void createNewAcc() throws IOException, InterruptedException {
		 PomVery p=new PomVery();
		WebElement acc = p.getAccoutBtn();
		click(acc);
		WebElement regiSterBtn = p.getRegiSterBtn();
		click(regiSterBtn);
		 WebElement selectTitle = p.getSelectTitle();
		 selectbyindex(selectTitle, 4);
		 WebElement firstName = p.getFirstName();
		 sentKeys(firstName, readExcel("C:\\Users\\Gobi\\eclipse-workspace\\VeryTestNG\\excel\\Very.xlsx", "AccoutCreate", 0, 1, "dd-mm-yyyy"));
		 WebElement lastName = p.getLastName();
		 sentKeys(lastName, readExcel("C:\\Users\\Gobi\\eclipse-workspace\\VeryTestNG\\excel\\Very.xlsx", "AccoutCreate", 1, 1, "dd-mm-yyyy"));
		 WebElement date = p.getSelectDobDate();
		 selectbyindex(date, 13);
		 WebElement dobMonth = p.getSelectDobMonth();
		 selectbyindex(dobMonth, 6);
		 WebElement dobYear = p.getSelectDobYear();
		 selectbyindex(dobYear, 11);
		 WebElement contectNumber = p.getContectNumber();
		 sentKeys(contectNumber, readExcel("C:\\Users\\Gobi\\eclipse-workspace\\VeryTestNG\\excel\\Very.xlsx", "AccoutCreate", 2, 1, "dd-mm-yyyy"));
		 WebElement emailId = p.getEmailId();
		 sentKeys(emailId, readExcel("C:\\Users\\Gobi\\eclipse-workspace\\VeryTestNG\\excel\\Very.xlsx", "AccoutCreate", 3, 1, "dd-mm-yyyy"));
		 WebElement passwordCond = p.getPasswordCond();
		 getText(passwordCond);
		 WebElement passWord = p.getPassWord();
		 sentKeys(passWord, readExcel("C:\\Users\\Gobi\\eclipse-workspace\\VeryTestNG\\excel\\Very.xlsx", "AccoutCreate", 4, 1, "dd-mm-yyyy"));
		 WebElement postCode = p.getPostCode();
		 sentKeys(postCode, readExcel("C:\\Users\\Gobi\\eclipse-workspace\\VeryTestNG\\excel\\Very.xlsx", "AccoutCreate", 5, 1, "dd-mm-yyyy"));
		 WebElement findAddress = p.getFindAddress();
		 click(findAddress);
		 Thread.sleep(2000);
		 WebElement selectAddress = p.getSelectAddress();
		 selectbyindex(selectAddress, 2);
		 WebElement registerCheckbox1 = p.getRegisterCheckbox1();
		 getText(registerCheckbox1);
		 click(registerCheckbox1);
		 WebElement registerCheckbox2 = p.getRegisterCheckbox2();
		 getText(registerCheckbox2);
		 click(registerCheckbox2);
		
		 WebElement continuetoclick = p.getContinuetoclick();
		 click(continuetoclick);
		 

		

	}

	@Test(priority = 1)
	private void registerBtn() {
		System.out.println("test2");
		// PomVery p=new PomVery();
		

	}
	@Test(priority=2)
	private void fillAndClick() {
		// PomVery p=new PomVery();
		
		
	}
	

}
