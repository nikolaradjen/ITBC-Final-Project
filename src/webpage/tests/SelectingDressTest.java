package webpage.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webpage.objects.SelectingDresses;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingDressTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {

		System.setProperty("webdriver.chrome.driver", "/Users/rara/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	// this method tests adding two dresses
	public void addingTwoDressesCheck() {

		SelectingDresses.addingTwoDresses(driver);

		String current = driver.getCurrentUrl();
		String expected = "http://automationpractice.com/index.php?controller=order";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(current, expected);

	}

	@Test
	// this method tests if specific dresses are added 
	public void addingTwoSpecificDressesCheck() {

		SelectingDresses.addingTwoDresses(driver);

		String dressName = driver
				.findElement(By.xpath("//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]"))
				.getText();

		String colorSize = driver
				.findElement(By.xpath("//td[@class='cart_description']//a[contains(text(),'Color : Blue, Size : M')]"))
				.getText();
		WebElement quantity = driver.findElement(By.xpath("//input[@name='quantity_5_24_0_0']"));
		String quantityValue = quantity.getAttribute("value");

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(colorSize, "Color : Blue, Size : M");
		sa.assertEquals(dressName, "Printed Summer Dress");
		sa.assertEquals(quantityValue, "2");

		sa.assertAll();

	}
}
