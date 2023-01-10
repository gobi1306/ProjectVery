package org.very;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomVery extends BaseClass {
	public PomVery() {
		PageFactory.initElements(driver, this);
	}
	//create accout or login need elements
	@FindBy(xpath="//input[@id='header-searchInput']")
	private WebElement searchText;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement searchBtn;
	@FindBy(xpath="//span[@class='header-logState-label']")
	private WebElement accoutBtn;
	@FindBy(xpath="//input[@id='newCustomerSubmitButton']")
	private WebElement regiSterBtn;
	@FindBy(xpath="//input[@id='registration-fe__firstName']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='registration-fe__lastName']")
	private WebElement lastName;
	@FindBy(xpath="//input[@id='registration-fe__contactNumber']")
	private WebElement contectNumber;
	@FindBy(xpath="//input[@id='registration-fe__email']")
	private WebElement emailId;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	@FindBy(xpath="//input[@id='search-postcode']")
	private WebElement postCode;
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement registerContinuebtn;
	@FindBy(xpath="//span[contains(text(),'ticking')]")
	private WebElement registerCheckbox1;
	@FindBy(xpath="//span[contains(text(),'3rd ')]")
	private WebElement registerCheckbox2;
	@FindBy(xpath="//select[@id='registration-fe__title']")
	private WebElement selectTitle;
	@FindBy(xpath="//select[@id='registration-fe__dob__day']")
	private WebElement selectDobDate;
	@FindBy(xpath="//select[@id='registration-fe__dob__month']")
	private WebElement selectDobMonth;
	@FindBy(xpath="//select[@id='registration-fe__dob__year']")
	private WebElement selectDobYear;
	@FindBy(xpath="//button[text()='Find address']")
	private WebElement findAddress;
	@FindBy(xpath="(//div[@class='sc-hrWEMg hRqizW'])[1]")
	private WebElement passwordCond;
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continuetoclick;
	@FindBy(xpath="//select[@class='sc-Rmtcm bIlzLy']")
	private WebElement selectAddress;
	public WebElement getSelectAddress() {
		return selectAddress;
	}
	public WebElement getFindAddress() {
		return findAddress;
	}
	public WebElement getPasswordCond() {
		return passwordCond;
	}
	public WebElement getContinuetoclick() {
		return continuetoclick;
	}
	public WebElement getSearchText() {
		return searchText;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getAccoutBtn() {
		return accoutBtn;
	}
	public WebElement getRegiSterBtn() {
		return regiSterBtn;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getContectNumber() {
		return contectNumber;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getPostCode() {
		return postCode;
	}
	public WebElement getRegisterContinuebtn() {
		return registerContinuebtn;
	}
	public WebElement getRegisterCheckbox1() {
		return registerCheckbox1;
	}
	public WebElement getRegisterCheckbox2() {
		return registerCheckbox2;
	}
	public WebElement getSelectTitle() {
		return selectTitle;
	}
	public WebElement getSelectDobDate() {
		return selectDobDate;
	}
	public WebElement getSelectDobMonth() {
		return selectDobMonth;
	}
	public WebElement getSelectDobYear() {
		return selectDobYear;
	}
	//order product element
	@FindBy(xpath="//a[@id='navMen']")
	private WebElement mensWear;
	@FindBy(xpath="(//a[text()='T-Shirts & Polos'])[2]")
	private WebElement tshirt;
	@FindBy(xpath="(//h2[@class=\"sdAccordion__title\"])[1]")
	private WebElement Style;
	@FindBy(xpath="(//span[text()='Polo Shirts'])[1]")
	private WebElement poloshirt;
	@FindBy(xpath="(//h2[@class='sdAccordion__title'])[3]")
	private WebElement brand;
	@FindBy(xpath="//span[text()='Armani Exchange']")
	private WebElement armaniExchage;
	@FindBy(xpath="(//h2[@class='sdAccordion__title'])[4]")
    private WebElement size;	
	@FindBy(xpath="//span[text()='M']")
	private WebElement sizetype;
	@FindBy(xpath="(//select[@id='productSortHeader'])[1]")
	private WebElement sortBY;
	@FindBy(xpath="//img[@title=\"Long Sleeved Logo Polo Shirt - Navy\"]")
	private WebElement selectedTshirt;
	@FindBy(xpath="//span[text()='£65']")
	private WebElement price;
	@FindBy(xpath="(//li[@class=\"ppOption__item\"])[3]")
	private WebElement selectsize;
	@FindBy(xpath="//input[@id='addToBasketButton']")
	private WebElement addtocart;
	@FindBy(xpath="//a[text()='Go to basket']")
	private WebElement gotobasket;
	@FindBy(xpath="//input[@class='textInput quantity']")
	private WebElement quantity;
	@FindBy(xpath="//div[@class='basketTotal']")
	private WebElement basketTotl;
	@FindBy(id="basketContinueButtonBottom")
	private WebElement checkout;	
	
	public WebElement getGotobasket() {
		return gotobasket;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getBasketTotl() {
		return basketTotl;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getStyle() {
		return Style;
	}
	public WebElement getPoloshirt() {
		return poloshirt;
	}
	public WebElement getBrand() {
		return brand;
	}
	public WebElement getArmaniExchage() {
		return armaniExchage;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getSizetype() {
		return sizetype;
	}
	public WebElement getSortBY() {
		return sortBY;
	}
	public WebElement getSelectedTshirt() {
		return selectedTshirt;
	}
	public WebElement getPrice() {
		return price;
	}
	public WebElement getSelectsize() {
		return selectsize;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getMensWear() {
		return mensWear;
	}
	public WebElement getTshirt() {
		return tshirt;
	}	
	
	
	

	
	
	
	
	
	
	

}
