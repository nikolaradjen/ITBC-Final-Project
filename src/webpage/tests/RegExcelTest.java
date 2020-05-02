package webpage.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import excel.ExcelUtils;
import webpage.objects.HomePage;
import webpage.objects.Registration;
import webpage.objects.SelectingDresses;

public class RegExcelTest {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {

		System.setProperty("webdriver.chrome.driver", "/Users/rara/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test // this method tests registereing users from excel

	public void regUserFromExcel() throws Exception {

		SoftAssert sa = new SoftAssert();
		for (int i = 10; i < 12; i++) {
			HomePage.goToHomePage(driver);
			HomePage.clickSignIn(driver);
			Registration.enterEmail(driver, ExcelUtils.getCellData(i, 3));
			Registration.clickOnCreateAcc(driver);
			Registration.enterFirstName(driver, ExcelUtils.getCellData(i, 1));
			Registration.enterLastName(driver, ExcelUtils.getCellData(i, 2));
			Registration.enterPassword(driver, ExcelUtils.getCellData(i, 4));
			Registration.enterAddress(driver, ExcelUtils.getCellData(i, 7));
			Registration.enterCity(driver, ExcelUtils.getCellData(i, 5));
			Registration.selectState(driver, ExcelUtils.getCellData(i, 6));
			Registration.enterZip(driver, ExcelUtils.getCellData(i, 9));
			Registration.enterMobile(driver, ExcelUtils.getCellData(i, 8));
			Registration.clickRegister(driver);

			// checking if registration was successful 
			String current = driver.getTitle();
			String expected = "My account - My Store";
			sa.assertEquals(current, expected);

			Registration.clickOnLogOutBtn(driver);

		}
		sa.assertAll();

	}

	@Test // this method tests if registrated user can sign in

	public static void signInCheck() throws Exception {

		SoftAssert sa = new SoftAssert();
		for (int i = 10; i < 12; i++) {

			HomePage.goToHomePage(driver);
			HomePage.clickSignIn(driver);

			Registration.enterEmailSignIn(driver, ExcelUtils.getCellData(i, 3));
			Registration.enterPasswordSignIn(driver, ExcelUtils.getCellData(i, 4));
			Registration.clickSignIn(driver);
			String current = driver.getTitle();
			String expected = "My account - My Store";

			sa.assertEquals(current, expected);
			Registration.clickOnLogOutBtn(driver);

		}

		sa.assertAll();

	}

}
