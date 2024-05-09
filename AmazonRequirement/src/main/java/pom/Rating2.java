package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rating2 {
	
	//@FindBy(xpath=("(//span[contains(text(),'out of 5 stars')])[1]"))
	//private WebElement rating;
	
	@FindBy(xpath=("(//span[@id='acrCustomerReviewText'])[1]"))
	private WebElement rating;

	
	
	
	private Actions act;
	private WebDriver driver;
	private JavascriptExecutor js;
	


	public Rating2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		//js=(JavascriptExecutor) driver;

	}
	
	
	public void  clickonRatingOfProuct() throws InterruptedException
	{
		//js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		
	   // js.executeScript("arguments[0].scrollIntoview(true),rating");
	   // act=new Actions(driver);
	   //act.moveToElement(rating).click().build().perform();
	    rating.click();
	}
	
}
