package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards {
	
	@FindBy(xpath=("//div[@class='nav-line-1-container']"))
	private WebElement acccountandList;

	
	@FindBy(xpath=("(//div[@class='a-row'])[6]"))
	private WebElement giftCards;

	
	@FindBy(xpath=("(//a[text()='Reload Your Balance'])[1]"))
	private WebElement reloadBalance;
	
	@FindBy(xpath=("//a[text()='Redeem a Gift Card']"))
	private WebElement reedemAgiftCard;
	
	
	
	
	@FindBy(xpath=("//div[@id='gc-balance-left-pane']//li[1]"))
	private WebElement viewGiftCardBalance;

	
	@FindBy(xpath=("//div[@id='gc-balance-left-pane']//li[2]"))
	private WebElement Reedemgiftcard;

	
	@FindBy(xpath=("//div[@id='gc-balance-left-pane']//li[3]"))
	private WebElement manageBulkGiftCardOrders;
	
	@FindBy(xpath=("//div[@id='gc-balance-left-pane']//li[5]"))
	private WebElement purchaseGiftCard;
	
	@FindBy(xpath=("//div[@id='gc-balance-left-pane']//li[6]"))
	private WebElement giftCardHelp;

	
	GiftCards(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	

	public void ClickonSearchButton()
	{
		acccountandList.click();
		//driver.navigate.back();
		giftCards.click();
		reloadBalance.click();
		reedemAgiftCard.click();
		manageBulkGiftCardOrders.click();
		purchaseGiftCard.click();
		purchaseGiftCard.click();


		
	}


	

	
	
	
}
