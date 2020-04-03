package webpage.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectingDresses {

	public static final String SUMMER_DRESSES_URL = "http://automationpractice.com/index.php?id_category=11&controller=category";
	public static final String DRESS_SELECTION = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
	public static final String PLUS_BTN = "//a[@class='btn btn-default button-plus product_quantity_up']//span";
	public static final String BLUE_COLOR = "//a[@id='color_14']";
	public static final String ADD_TO_CART_BTN = "//span[contains(text(),'Add to cart')]";
	public static final String SIZE_MENU = "//select[@id='group_1']";
	public static final String SIZE_M = "//option[contains(text(),'M')]";
	public static final String PROCEED_TO_CHECKOUT_BTN = "//span[contains(text(),'Proceed to checkout')]";
	
	public static void goToSummerDressesURL (WebDriver driver) {
		driver.get(SUMMER_DRESSES_URL);
	}
	
	public static void selectDress (WebDriver driver) {
		driver.findElement(By.xpath(DRESS_SELECTION)).click();
		
	}
	
	public static void selectColor (WebDriver driver) {
		driver.findElement(By.xpath(BLUE_COLOR)).click();
		
	}
	
	public static void selectSizeM(WebDriver driver) {
		driver.findElement(By.xpath(SIZE_MENU)).click();
		driver.findElement(By.xpath(SIZE_M)).click();

	}
	
	public static void increaseQuantity (WebDriver driver) {
		driver.findElement(By.xpath(PLUS_BTN)).click();
	}
	
	public static void addToCart (WebDriver driver) {
		driver.findElement(By.xpath(ADD_TO_CART_BTN)).click();;
	}
	
	public static void proceedToCheckout (WebDriver driver) {
		driver.findElement(By.xpath(PROCEED_TO_CHECKOUT_BTN)).click();
	}
	
	public static void addingTwoDresses (WebDriver driver) {
		goToSummerDressesURL(driver);
		selectDress(driver);
		selectColor(driver);
		selectSizeM(driver);
		increaseQuantity(driver);
		addToCart(driver);
		proceedToCheckout(driver);
		
	}
	
	
}
