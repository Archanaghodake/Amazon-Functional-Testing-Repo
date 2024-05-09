package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LimitOfItemAddedintoCart {

	@FindBy(xpath = ("//input[@id='twotabsearchtextbox']"))//1
	private WebElement searchbox;

	@FindBy(xpath = ("//input[@id='nav-search-submit-button']"))  //2
	private WebElement searchbutton;
	
	

	@FindBy(xpath = ("(//div[@data-asin='B00JAK1PMI']//img)[1]"))   //3
	private WebElement watches;
	
	@FindBy(xpath = ("//span[@id='submit.add-to-cart']"))    //4
	private WebElement addToCart;
	
	@FindBy(xpath = ("//select[@id='quantity']"))    //4
	private WebElement quantityButton;
	
	private WebDriverWait wait;
	private WebDriver driver;


	public   LimitOfItemAddedintoCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
		wait=new  WebDriverWait(driver,Duration.ofMillis(3000));
	}
		

	public void sendValuesToSearchBox(String value) 
		{
			searchbox.sendKeys(value);
		}

	public void clickOnSearchButton() {
		searchbutton.click();
	}

	public void chooseYourWatch() {
		watches.click();
	}

	public void clickOnAddToCart() {
		addToCart.click();
	}
	
	public void clickOnquantityButton()
	{
		Select s=new Select(quantityButton);
		s.selectByValue("100");
		
		quantityButton.click();
	}


	
	
}
