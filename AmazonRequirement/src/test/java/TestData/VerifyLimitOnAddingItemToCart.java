package TestData;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LimitOnAddingItemToCart;

public class VerifyLimitOnAddingItemToCart {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		LimitOnAddingItemToCart limit=new LimitOnAddingItemToCart(driver);
		limit.sendValuesToSearchBox("Purse");
		limit.clickOnSearchButton();
		

		limit.chooseYourPurse();
		
		List<String> list=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));

		limit.clickOnAddToCart();
		limit.ClickOnAddToCartImage();
		limit.selectQuantity();
		
		
	
	}

}
