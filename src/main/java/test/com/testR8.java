package test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

// groups ... assetions --- soft hard assertion --- dataproviders
public class testR8 {

	static ChromeDriver driver;
	
	public static void loginUser(String username , String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromeFinal\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login-button")).click();
		List<WebElement> products = driver.findElements(By.cssSelector(".inventory_item_name"));
		Assert.assertEquals(products.size(), 6);
		
	}
	
	
	
	
	@Test
	public void testcase1() {
		System.out.println("Login");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromeFinal\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
//		List<WebElement> products = driver.findElements(By.cssSelector(".inventory_item_name"));
//		Assert.assertEquals(products.size(), 6);
		
		//testR8.loginUser("standard_user","secret_sauce");
//		testR8.loginUser("locked_out_user","secret_sauce");
//		testR8.loginUser("problem_user","secret_sauce");
//		testR8.loginUser("performance_glitch_user","secret_sauce");
		
	}
	
	

}
