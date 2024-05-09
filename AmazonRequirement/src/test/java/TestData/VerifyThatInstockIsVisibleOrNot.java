package TestData;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductPom.Instock;
import ProductPom.Instock2;


public class VerifyThatInstockIsVisibleOrNot {

	
		public static void main(String[] args) throws InterruptedException 
		{
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
	   
			Instock instock = new Instock(driver);
	    instock.Sendsearchtab("Iphone 15 pro max");
	    instock.Searchiconclick();
	    instock.gotomobile();
	   
	    Instock2 instock2 = new Instock2(driver);
	    List<String>list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		instock2.stockinn();
	//boolean result = stockinn.isDisplayed();
//		System.out.println("result");
	//   if(result==true) {
//		   System.out.println("Element is Displayed");
	//   }
	//   else
	//   {
//		   System.out.println("Element is not Displayed");
	//   }
		
	//    
	}
	}

