package TestData;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Rating1;
import pom.Rating2;
import pom.RemoveFromAddToCartPage;
import pom.RemoveFromAddToCartPage1;

public class ItemRemoveFromAddToCart {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		

		RemoveFromAddToCartPage Ac=new RemoveFromAddToCartPage(driver);
		Ac.PasstheDataintoSearchTab("Mobile phones");
		Ac.ClickonSearchButton();
		Ac.ClickonFirstMobileButton();
		
		List<String> list=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
        Ac.ClickonAddTocart();


	//List<String> list1=new ArrayList<String>(driver.getWindowHandles());
    //driver.switchTo().window(list1.get(2));

		RemoveFromAddToCartPage1 RemoveAc=new RemoveFromAddToCartPage1(driver);

		
		RemoveAc.CheckAddToCartPage();		
		RemoveAc.RemoveItemFromCart();
		
	//	RemoveAc.ClickOnCancelButton();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
