package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		WebElement elePassword = driver.findElement(By.id("password"));
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleUserName.sendKeys("Demosalesmanager");
		elePassword.sendKeys("crmsfa");
		eleLogin.click();
		WebElement eleCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		eleCRMSFA.click();
		WebElement eleCreateLead = driver.findElement(By.linkText("Create Lead"));
		eleCreateLead.click();
		WebElement eleCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		eleCompanyName.sendKeys("Testss");
		WebElement eleFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		eleFirstName.sendKeys("ScTesting");
		WebElement eleLastName = driver.findElement(By.id("createLeadForm_lastName"));
		eleLastName.sendKeys("S");
		WebElement eleNameLocal = driver.findElement(By.name("firstNameLocal"));
		eleNameLocal.sendKeys("Chandru");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		eleSource.sendKeys("Existing Customer");
		WebElement eleCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select src = new Select(eleCampaign);
		src.selectByIndex(4);
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ind = new Select(eleIndustry);
		ind.selectByVisibleText("Finance");
		WebElement eleOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select(eleOwner);
		own.selectByValue("OWN_CCORP");
		WebElement eleDepartment = driver.findElement(By.name("departmentName"));
		eleDepartment.sendKeys("QA");
		WebElement eleDescription = driver.findElement(By.id("createLeadForm_description"));
		eleDescription.sendKeys("Internal Quality Assurance - Automation");
		WebElement eleEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		eleEmail.sendKeys("chandru@testleaf.com");
		WebElement eleProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select pro = new Select(eleProvince);
		pro.selectByVisibleText("New York");
		WebElement eleSubmit = driver.findElement(By.className("smallSubmit"));
		eleSubmit.click();
		String vrtxt = driver.getTitle();
		if(vrtxt.contains("View Lead | opentaps CRM"))
		{
			System.out.println("Lead Created Successfully");
		}
		else
		{
			System.out.println("Lead Creation Failed");
		}
		WebElement eleDuplicate = driver.findElement(By.linkText("Duplicate Lead"));
		eleDuplicate.click();
		Thread.sleep(3000);
		WebElement eleNewCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		eleNewCompanyName.clear();
		eleNewCompanyName.sendKeys("CTS");
		WebElement eleNewFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		eleNewFirstName.clear();
		eleNewFirstName.sendKeys("Chandran");
		WebElement eleNewSubmit = driver.findElement(By.className("smallSubmit"));
		eleNewSubmit.click();
		String vrtxt2 = driver.getTitle();
		if(vrtxt2.contains("View Lead | opentaps CRM"))
		{
			System.out.println("Lead Duplicated Successfully");
		}
		else
		{
			System.out.println("Lead Duplication Failed");
		}
		
	}

}
