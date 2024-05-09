package TestData;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import pom.Rating1;
import pom.Rating2;

	public class RatinIsDisplayedOrNot {
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			

			Rating1 rt=new Rating1(driver);
			rt.PasstheDataintoSearchTab("Mobile phones");
			rt.ClickonSearchButton();

			rt.ClickonMobile();
			
			Rating2 ratin2=new Rating2(driver);
			
			List<String> list=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(list.get(1));
			ratin2.clickonRatingOfProuct();
		    System.out.println("Rating is displayed");

			
}

}