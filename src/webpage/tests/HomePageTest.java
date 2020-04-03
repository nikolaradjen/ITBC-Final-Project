package webpage.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webpage.objects.HomePage;

public class HomePageTest {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/rara/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test

	//this method tests reaching summer dresses through women button

	public void SummerDressesThroughWomen() {

		HomePage.clickWSummerDresses(driver);

		String current = driver.getCurrentUrl();
		String expected = "http://automationpractice.com/index.php?id_category=11&controller=category";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(current, expected);

	}

	@Test
	
	//this method tests reaching summer dresses through dresses button
	public void SummerDressesThroughDresses() {
		HomePage.clickDSummerDresses(driver);

		String current = driver.getCurrentUrl();
		String expected = "http://automationpractice.com/index.php?id_category=11&controller=category";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(current, expected);

	}

	@Test

	public void CheckinBothMethods() {

		String current1 = HomePage.clickDSummerDresses(driver);

		String current2 = HomePage.clickWSummerDresses(driver);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(current1, current2);
	}

}
