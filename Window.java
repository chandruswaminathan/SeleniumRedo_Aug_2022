package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String originalHandle = driver.getWindowHandle();
		WebElement eleOpen = driver.findElement(By.xpath("//span[text()='Open']"));
		eleOpen.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listHandles.get(1));
		System.out.println("New Window Opened: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(listHandles.get(0));
		WebElement eleOpenMultiple = driver.findElement(By.xpath("//span[text()='Open Multiple']"));
		eleOpenMultiple.click();
		Set<String> windowHandlesMultiple = driver.getWindowHandles();
		int size = windowHandlesMultiple.size();
		System.out.println("No of opened tabs are: "+ size);
		List<String> listHandlesMultiple = new ArrayList<String>(windowHandlesMultiple);
		System.out.println(listHandlesMultiple);
		for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalHandle);
		WebElement eleCloseAll = driver.findElement(By.xpath("//span[text()='Close Windows']"));
		eleCloseAll.click();
		for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }
		driver.switchTo().window(originalHandle);
		WebElement eleOpenDelay = driver.findElement(By.xpath("//span[text()='Open with delay']"));
		eleOpenDelay.click();
		driver.quit();

	}

}
