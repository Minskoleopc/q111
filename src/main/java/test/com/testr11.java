package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testr11 {
	
	// Arrange 
	
	// Action 
	
	// Assertion 
	
	// What is soft assertion ?
	// What is hard assertion ?
	
	//
	
	
	ChromeDriver driver;
	@Test
	public void ContactUs() {
		
		
		SoftAssert s = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromeFinal\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// verify the title
		
		String title = driver.getTitle();
		String expectedTitle = "WebDriver | Contact U";
		s.assertEquals(title, expectedTitle ,"assertion fail");
		
		// Check the title for contact us page
		WebElement e = driver.findElement(By.tagName("h2"));
		String  ea = e.getText();
		s.assertEquals(ea, "CONTACT US" ,"assertion fail 2");
		
		s.assertAll();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	

	
	
	
}
