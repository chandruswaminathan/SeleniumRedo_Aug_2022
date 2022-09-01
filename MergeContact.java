package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = driver.findElement(By.id("username"));
		WebElement elePassword = driver.findElement(By.id("password"));
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleUserName.sendKeys("Demosalesmanager");
		elePassword.sendKeys("crmsfa");
		eleLogin.click();
		WebElement eleCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		eleCRMSFA.click();
		WebElement eleContacts = driver.findElement(By.linkText("Contacts"));
		eleContacts.click();
		WebElement eleMergeContacts = driver.findElement(By.xpath("//a[text()='Merge Contacts']"));
		eleMergeContacts.click();
		WebElement eleFromContacts = driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]"));
		eleFromContacts.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listHandles.get(1));
		WebElement eleFromContactsFirst = driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-cell-first')]//div/a)[1]"));
		eleFromContactsFirst.click();
		driver.switchTo().window(listHandles.get(0));
		WebElement eleToContacts = driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		eleToContacts.click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listHandles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listHandles2.get(1));
		WebElement eleToContactsFirst = driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-cell-first')]//div/a)[2]"));
		eleToContactsFirst.click();
		driver.switchTo().window(listHandles2.get(0));
		WebElement eleMerge = driver.findElement(By.xpath("//a[text()='Merge']"));
		eleMerge.click();
		Alert alertSimple = driver.switchTo().alert();
		String textSimple = alertSimple.getText();
		System.out.println(textSimple);
		alertSimple.accept();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
