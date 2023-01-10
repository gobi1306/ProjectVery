package org.very;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orderproduct extends BaseClass {
	@BeforeClass
	private void browserLaun() {
		chromeBrowser();
		getUrl("https://www.very.co.uk/");
		

		driver.findElement(By.xpath("//button[@class='cookieMessage__button']")).click();
		
		
	}
	@Test(priority=-1)
	private void orderpage() throws InterruptedException, IOException {
		
		PomVery p=new PomVery();
		WebElement mensWear = p.getMensWear();
		mouseOver(mensWear);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement tshirt = p.getTshirt();
		click(tshirt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement style = p.getStyle();
		click(style);
		WebElement poloshirt = p.getPoloshirt();
		click(poloshirt);
		Thread.sleep(2000);
		WebElement brand = p.getBrand();
		click(brand);
		Thread.sleep(2000);
		WebElement armaniExchage = p.getArmaniExchage();
		click(armaniExchage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement sortBY = p.getSortBY();
		selectbyindex(sortBY, 3);
		Thread.sleep(3000);
		WebElement selectedTshirt = p.getSelectedTshirt();
		click(selectedTshirt);
		WebElement price = p.getPrice();
		getText(price);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@class='truefit-signpostbutton']")).click();
		WebElement selectsize = p.getSelectsize();
		click(selectsize);
		WebElement addtocart = p.getAddtocart();
		click(addtocart);
		WebElement gotobasket = p.getGotobasket();
		click(gotobasket);
		WebElement quantity = p.getQuantity();
		sentKeys(quantity, "0");
		WebElement basketTotl = p.getBasketTotl();
		getText(basketTotl);
		Thread.sleep(3000);
		WebElement checkout = p.getCheckout();
		click(checkout);
	}
		@Test(priority=1)
	
		 private void aftercheck() throws IOException, InterruptedException {
			PomVery p=new PomVery();
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

}
