package webpage.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static final String PROCEED_TO_CHECKOUT_CART_BTN = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
	public static final String CREATE_AN_ACC_BTN = "//form[@id='create-account_form']//span[1]";
	public static final String EMAIL = "//input[@id='email_create']"; 
	public static final String FIRST_NAME = "//input[@id='customer_firstname']";
	public static final String LAST_NAME = "//input[@id='customer_lastname']";
	public static final String PASSWORD = "//input[@id='passwd']";
	public static final String FIRST_NAME2 = "//input[@id='firstname']";
	public static final String LAST_NAME2 = "//input[@id='lastname']";
	public static final String ADDRESS = "//input[@id='address1']";
	public static final String CITY = "//input[@id='city']";
	public static final String STATE_MENU_ID = "id_state";
	public static final String ZIP = "//input[@id='postcode']";
	public static final String MOBILE_PHONE_ID = "phone_mobile";
	public static final String LOG_OUT_BTN = "//a[@class='logout']";
	public static final String REGISTER_BTN = "//button[@id='submitAccount']";
	public static final String EMAIL_FIELD_REG_FORM = "//input[@id='email']";
	public static final String LOGIN_EMAIL_FIELD = "//input[@id='email']";
	public static final String LOGIN_PASSWORD_FIELD = "//input[@id='passwd']";
	public static final String SIGN_IN_BTN = "//p[@class='submit']//span[1]";
	
	public static void clickOnProceedToCheckout (WebDriver driver) {
		driver.findElement(By.xpath(PROCEED_TO_CHECKOUT_CART_BTN)).click();
	}
	
	public static void clickOnCreateAcc(WebDriver driver) {
		driver.findElement(By.xpath(CREATE_AN_ACC_BTN)).click();
	}

	public static void enterEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL)).click();
		driver.findElement(By.xpath(EMAIL)).sendKeys(email);
	}

	public static void enterFirstName(WebDriver driver, String firstname) {
		driver.findElement(By.xpath(FIRST_NAME)).sendKeys(firstname);
	}
	

	public static void enterLastName(WebDriver driver, String lastname) {
		driver.findElement(By.xpath(LAST_NAME)).sendKeys(lastname);

	}

	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORD)).sendKeys(password);
	}

	public static void enterFirstName1(WebDriver driver, String firstname1) {
		driver.findElement(By.xpath(FIRST_NAME2)).sendKeys(firstname1);
	}

	public static void enterLastName1(WebDriver driver, String lastname1) {
		driver.findElement(By.xpath(LAST_NAME2)).sendKeys(lastname1);

	}

	public static void enterAddress(WebDriver driver, String address) {
		driver.findElement(By.xpath(ADDRESS)).sendKeys(address);
	}

	public static void enterCity(WebDriver driver, String city) {
		driver.findElement(By.xpath(CITY)).sendKeys(city);
	}

	public static void enterZip(WebDriver driver, String zip) {
		driver.findElement(By.xpath(ZIP)).sendKeys(zip);
	}

	public static void enterMobile(WebDriver driver, String mobile) {
		driver.findElement(By.id(MOBILE_PHONE_ID)).sendKeys(mobile);
	}
	public static void enterEmailInReqForm (WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_FIELD_REG_FORM)).sendKeys(email);
	}

	public static void selectState(WebDriver driver, String state) {
		
		WebElement state_menu = driver.findElement(By.id(STATE_MENU_ID));
		Select select = new Select(state_menu);
		select.selectByVisibleText(state);
		state_menu.click();

	}

	public static void clickRegister(WebDriver driver) {
		driver.findElement(By.xpath(REGISTER_BTN)).click();
	}
	
	public static void clickSignIn (WebDriver driver) {
		driver.findElement(By.xpath(SIGN_IN_BTN)).click();
	}
	
	public static void enterEmailSignIn (WebDriver driver, String email) {
		driver.findElement(By.xpath(LOGIN_EMAIL_FIELD)).click();
		driver.findElement(By.xpath(LOGIN_EMAIL_FIELD)).sendKeys(email);
	}
	
	public static void enterPasswordSignIn (WebDriver driver, String password) {
		driver.findElement(By.xpath(LOGIN_PASSWORD_FIELD)).click();
		driver.findElement(By.xpath(LOGIN_PASSWORD_FIELD)).sendKeys(password);
	}

	public static void clickOnLogOutBtn (WebDriver driver) {
		driver.findElement(By.xpath(LOG_OUT_BTN)).click();
	}
}
