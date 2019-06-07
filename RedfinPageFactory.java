package selfLearning.testSeleniumSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RedfinPageFactory {
	
	WebDriver driver;

	@FindBy(xpath="//input[@placeholder='City, Address, School, Agent, ZIP']")
	WebElement citySearchTextBox;
	
	@FindBy(xpath="//a[@href='/city/245/NY/Albany']/parent::div")
	WebElement albanyCity;
	
	@FindBy(xpath="//span[contains(text(),'Filters')]")
	WebElement filtersLink;
	
//	@FindBy(xpath="//*[@id=\"scrollableSearchForm\"]/div[2]/div[1]/div/div[2]/span[1]/span/span/span/span[2]/*[name()='svg']/*[name()='svg']/*[name()='path']")
//	WebElement minBeds;
	
	@FindBy(xpath="//span[text()='2']")
	WebElement minBeds;
	
	@FindBy(xpath="//span[text()=32']")
	WebElement maxBeds;
	
	@FindBy(xpath="(//span[@class='step-up'])[1]")
	WebElement bathrooms;
	
	@FindBy(xpath="//span[text()='House']")
	WebElement proprtyType;
	
	@FindBy(xpath="//span[text()='Apply Filters']")
	WebElement applyFilter;
	
	@FindBy(xpath="(//span[text()='No min'])[3]")
	WebElement minBedDropdown;
	
	@FindBy(xpath="(//span[text()='No max'])[3]")
	WebElement maxBedDropdown;
	
	@FindBy(xpath="//div[@class='filter summary font-weight-roman']")
	WebElement filterSummary;
	
	
	
	public RedfinPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectCity(String city) {
		citySearchTextBox.sendKeys(city);
		albanyCity.click();
		
	}
	
	public void createSearchFilter() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(filtersLink));
			filtersLink.click();
			wait.until(ExpectedConditions.visibilityOf(minBedDropdown));
			minBedDropdown.click();
			Select minimumselect = new Select(minBedDropdown);
			minimumselect.selectByVisibleText("2");
			wait.until(ExpectedConditions.visibilityOf(maxBedDropdown));
			Select maximumselect = new Select(maxBedDropdown);
			maximumselect.selectByVisibleText("3");
			bathrooms.click();
			proprtyType.click();
			applyFilter.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
		
		
	}
	
	public String verifyFilterCriteria() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(filterSummary));
		return filterSummary.getText();
		
		
	}
	
	
//	
//	public void setFirstName(String firstname) {
//		firstName.sendKeys(firstname);
//	}
//	
//	public void setLastName(String lastname) {
//		firstName.sendKeys(lastname);
//	}
//	
//	public void setPassword(String password1) {
//		password.sendKeys(password1);
//		WebDriverWait wait = new WebDriverWait(driver, 3);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
//	}

}
