package webpage.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webpage.objects.Registration;
import webpage.objects.SelectingDresses;

public class RegistrationTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {

		System.setProperty("webdriver.chrome.driver", "/Users/rara/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test

	//this method tests registering one user
	
	public void registerAccCheck() {
		String email = "bbbbb22bla@sharklasers.com";
		String firstName = "Pera";
		String lastName = "Petrovic";
		String password = "sifra1";
		String address = "Srpskih Vladara 32";
		String city = "New York";
		String state = "New York";
		String zip = "10001";
		String mobile = "12345678";
		SelectingDresses.addingTwoDresses(driver);
		Registration.clickOnProceedToCheckout(driver);
		Registration.enterEmail(driver, email);
		Registration.clickOnCreateAcc(driver);
		Registration.enterFirstName(driver, firstName);
		Registration.enterLastName(driver, lastName);
		Registration.enterPassword(driver, password);
		Registration.enterAddress(driver, address);
		Registration.enterCity(driver, city);
		Registration.selectState(driver, state);
		Registration.enterZip(driver, zip);
		Registration.enterMobile(driver, mobile);
		Registration.clickRegister(driver);

		SoftAssert sa = new SoftAssert();
		sa.assertNotNull(Registration.LOG_OUT_BTN);

	}
	
	
	
}
