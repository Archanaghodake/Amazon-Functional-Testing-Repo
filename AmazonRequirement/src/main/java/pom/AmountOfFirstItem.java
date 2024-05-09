package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmountOfFirstItem {

	@FindBy(xpath = ("//input[@id='twotabsearchtextbox']")) // 1
	private WebElement searchbox;

	@FindBy(xpath = ("//input[@id='nav-search-submit-button']")) // 2
	private WebElement searchbutton;
	
	@FindBy(xpath = ("(//div[2]//span//a//img[@class='s-image'])[1]"))   //3
	private WebElement option2;
	
	@FindBy(xpath = ("//span[@id='submit.add-to-cart']"))    //4
	private WebElement AddToCart;


	private WebDriverWait wait;

	private WebDriver driver;
	
	
	public   AmountOfFirstItem (WebDriver driver) 
	{

		PageFactory.initElements(driver, this);
		wait=new  WebDriverWait(driver,Duration.ofMillis(3000));
		this.driver = driver;

		//act=new Actions(driver);

	}
	
	
	public void sendValuesToSearchBox(String value) {
		searchbox.sendKeys(value);
	}

	public void clickOnSearchButton() {
		searchbutton.click();
	}
	
	public void chooseYourPurse() {
		option2.click();
	}

	
	public void clickOnAddToCart() {
		AddToCart.click();
	}

	
	
	
	
	
	
	
}
