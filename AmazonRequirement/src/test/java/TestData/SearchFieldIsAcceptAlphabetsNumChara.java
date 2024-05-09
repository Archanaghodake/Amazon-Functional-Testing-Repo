package TestData;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Rating1;


public class SearchFieldIsAcceptAlphabetsNumChara {
	public static void main(String[] args) {
		
	

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	

	Rating1 rt=new Rating1(driver);
	rt.PasstheDataintoSearchTab("Mobile phones_12");
	rt.ClickonSearchButton();
   // rt.ClickonMobile();
	
	
	
	
}
}
