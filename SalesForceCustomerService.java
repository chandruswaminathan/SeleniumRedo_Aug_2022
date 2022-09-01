package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceCustomerService {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = driver.findElement(By.id("username"));
		WebElement elePassword = driver.findElement(By.id("password"));
		WebElement eleLogin = driver.findElement(By.id("Login"));
		eleUserName.sendKeys("ramkumar.ramaiah@testleaf.com");
		elePassword.sendKeys("Password#123");
		eleLogin.click();
		WebElement eleLearnMore = driver.findElement(By.xpath("//span[text()='Learn More']"));
		eleLearnMore.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listHandles.get(1));
		WebElement eleConfirm = driver.findElement(By.xpath("//button[text()='Confirm']"));
		eleConfirm.click();
		System.out.println("New Page Title: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(listHandles.get(0));
		driver.close();

	}

}
