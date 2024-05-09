package TestData;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AmountOfFirstItem;
import pom.AmountOfSecondItem;
import pom.RemoveFromAddToCartPage;

public class VerifyThatTotalAmountOfItemShouldBeDisplayed {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
        
		AmountOfFirstItem secondItm=new AmountOfFirstItem(driver);
		secondItm.sendValuesToSearchBox("Purse");
		secondItm.clickOnSearchButton();
		secondItm.chooseYourPurse();
		List<String> list1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list1.get(1));
         secondItm.clickOnAddToCart();
		
		
		RemoveFromAddToCartPage Ac=new RemoveFromAddToCartPage(driver);
		Ac.PasstheDataintoSearchTab("Mobile phones");
		Ac.ClickonSearchButton();
		Ac.ClickonFirstMobileButton();
		List<String> list=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(2));
        Ac.ClickonAddTocart();


		
        AmountOfSecondItem seconditm=new AmountOfSecondItem(driver);
        seconditm.clickOnCartButtonForCheck();
        seconditm.subTOtalOfAllItem();
		
        

		
	}

}

