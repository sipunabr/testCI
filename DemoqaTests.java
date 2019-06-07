package selfLearning.testSeleniumSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DemoqaTests {
	private WebDriver driver;
	private String baseURL;
	RedfinPageFactory redfin;
	
  @Test
  public void registration() {
	  
	  redfin.selectCity("Albany");
	  redfin.createSearchFilter();
	  org.testng.Assert.assertEquals("2-3 beds, 1+ baths, house", redfin.verifyFilterCriteria());
	  
	  
	  
  }
  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  baseURL = "https://www.redfin.com";
	  
	  redfin = new RedfinPageFactory(driver);
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get(baseURL);
	  
	  
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
