package ProductPom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Instock {
		@FindBy(xpath = ("//input[@id=\"twotabsearchtextbox\"]"))
		private WebElement searchtab;
		@FindBy(xpath = ("//input[@id=\"nav-search-submit-button\"]"))
		private WebElement Searchbutton;
		@FindBy(xpath =("//div[8]//h2//a//span[1]"))
		private WebElement Mobileclick;
		private Actions act;
		private WebDriver driver;
		
		public Instock(WebDriver driver) {
			this.driver = driver;
			act = new Actions (driver);
			PageFactory.initElements(driver, this);
			}
		
		public void Sendsearchtab(String Product) {
			searchtab.sendKeys(Product);
		}
//		act.moveToElement(Apple iPhone 15 Pro Max (256 GB) - Blue Titanium).click().build().perform();

		public void Searchiconclick() {
			Searchbutton.click();
			
		}
		public void gotomobile() {
			act.moveToElement(Mobileclick).click().build().perform();
			Mobileclick.click();		
		}
	}


