package TestData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductPom.IncreaseInQuantityNumberOnAddingSameItem;

public class VerifyIncreaseInQuantityNumberOnAddingSameItem 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		IncreaseInQuantityNumberOnAddingSameItem inc=new IncreaseInQuantityNumberOnAddingSameItem(driver);
		inc.sendValuesToSearchBox("Casio Watches");
		inc.clickOnSearchButton();
		inc.chooseYourWatch();
		inc.clickOnAddToCart();
		inc.clickOnskipButton();
		inc.clickOnquantityButton();

		inc.clickOnAddToCartImage();
		inc.checkqtyButton();
		
		}
}
