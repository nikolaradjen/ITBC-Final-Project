package webpage.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public static final String HOME_URL = "http://automationpractice.com/index.php";
	public static final String WOMEN = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	public static final String W_SUMMER_DRESSES = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]";
	public static final String DRESSES = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]";
	public static final String D_SUMMER_DRESSES = "//li[@class='sfHover']//ul[@class='submenu-container clearfix first-in-line-xs']//li//a[contains(text(),'Summer Dresses')]";
	public static final String SIGN_IN_BTN ="//a[@class='login']";

	
	public static String clickWSummerDresses(WebDriver driver) {
		driver.get(HOME_URL);
		Actions action = new Actions(driver);
		WebElement w_d_button = driver.findElement(By.xpath(WOMEN));
		action.moveToElement(w_d_button).perform();
		driver.findElement(By.xpath(W_SUMMER_DRESSES)).click();
		String current1 = driver.getCurrentUrl();
		return current1;
	}

	public static String clickDSummerDresses(WebDriver driver) {
		driver.get(HOME_URL);
		Actions action = new Actions(driver);
		WebElement w_d_button = driver.findElement(By.xpath(DRESSES));
		action.moveToElement(w_d_button).perform();
		driver.findElement(By.xpath(D_SUMMER_DRESSES)).click();
		String current = driver.getCurrentUrl();
		return current;

	}
	
	public static void goToHomePage (WebDriver driver) {
		driver.get(HOME_URL);
	}
	
	public static void clickSignIn (WebDriver driver) {
		driver.findElement(By.xpath(SIGN_IN_BTN)).click();
	}
}
