package TestData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LimitOfItemAddedintoCart;

public class VerifyLimitOfItemAddedintoCart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		
		LimitOfItemAddedintoCart Lac=new LimitOfItemAddedintoCart(driver);
		Lac.sendValuesToSearchBox("Casio Watches");
		Lac.clickOnSearchButton();
		Lac.chooseYourWatch();
		Lac.clickOnAddToCart();
		Lac.clickOnquantityButton();
		
		
		
	}

}

