package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveFromAddToCartPage1 {
		
		

	@FindBy(xpath=("(//input[@class='a-button-input'])[20]"))
	private WebElement CartButton;

	@FindBy(xpath=("(//input[@type='submit'])[7]"))
	private WebElement DeleteButton;
	

	
	private WebDriverWait wait;

	private Actions act;
	private WebDriver driver;
	private JavascriptExecutor js;

	public RemoveFromAddToCartPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		wait=new  WebDriverWait(driver,Duration.ofMillis(3000));

		this.driver=driver;

	}

	public void  CheckAddToCartPage()
	{
		  //  act=new Actions(driver);
		   //act.moveToElement(clickOnCartButton).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(CartButton));

		CartButton.click();

	}
	
	public void  RemoveItemFromCart()
	{
		DeleteButton.click();

	}


//	public void  ClickOnCancelButton()
//	{
//		CancelButton.click();
//
//	}
		
		
		
	

	
	
	
	
	
}
