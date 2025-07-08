package loginPage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {

	WebDriver driver = new ChromeDriver ();
	String theURL = "https://automationteststore.com/";
	String SignupPage = "https://automationteststore.com/index.php?rt=account/create"; 
	Random rand = new Random();
	
	
	@BeforeTest
	
	public void mySetup () {
		
//		driver.get("https://automationteststore.com/");
		driver.get(theURL);
			
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 1)
	public void signup () throws InterruptedException  {
		

			
			driver.navigate().to(SignupPage);
		
	Thread.sleep(2000);
			
			//Elements
			WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]"));
			WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='AccountFrm_lastname']"));
			WebElement emailInput = driver.findElement(By.xpath("//input[@id='AccountFrm_email']"));
			WebElement telephoneInput = driver.findElement(By.xpath("//input[@id='AccountFrm_telephone']"));
			WebElement faxInput = driver.findElement(By.id("AccountFrm_fax"));
			WebElement companyInput = driver.findElement(By.id("AccountFrm_company"));
			WebElement address1Input = driver.findElement(By.xpath("//input[@id='AccountFrm_address_1']"));
			WebElement address2Input = driver.findElement(By.id("AccountFrm_address_2"));
			WebElement postalCodeInput =  driver.findElement(By.id("AccountFrm_postcode"));	
			WebElement cityNameInput = driver.findElement(By.id("AccountFrm_city"));
			WebElement loginNameInput = driver.findElement(By.id("AccountFrm_loginname"));
			WebElement passwardInput = driver.findElement(By.id("AccountFrm_password"));
			WebElement passwardReconfirmInput = driver.findElement(By.id("AccountFrm_confirm"));
	
			
			WebElement agreebox = driver.findElement(By.id("AccountFrm_agree"));
			WebElement continuebutton = driver.findElement(By.cssSelector(".btn.btn-orange.pull-right.lock-on-click"));
			
			/*
			 *السبب: By.cssSelector(...) لازم يبدأ بـ . لو كنت تستخدم class name.

وفوق هيك، الكلاس فيه فراغات، يعني أكثر من class، فلازم تتعامل مع CSS Selector صح./
			 */
			
			//Data
			
			String[] firstNames = { "rahaf", "rogina", "dana", "mais", "dareen" };
					
			int randomIndexForFirstName = rand.nextInt(firstNames.length);
			
	
			String randomFirstName = firstNames [randomIndexForFirstName] ;

			String [] lastNames = {"alrajabi", "saif", "rakan"};
			int randomIndexForlastName = rand.nextInt(lastNames.length);
			
			String randomLastName = lastNames[randomIndexForlastName] ;
			
			int randomNumberForTheEmail = rand.nextInt(7000);
			String email = randomFirstName+randomLastName+ randomNumberForTheEmail +"@gmail.com";
		String telephone = "9627956325";
		String fax = "9624545755";
		String company = "abc";
		String address1 = "Amman tlaaelAli";
		String address2 = "Amman ShafaBadran";
		String city = "Amman";
		String postalCode = "12365";
		String password = "Test@1234";
		String loginName = "randomFirstName+randomLastName+ randomNumberForTheEmail";
			
			//Action
			firstNameInput.sendKeys(randomFirstName);
			lastNameInput.sendKeys(randomLastName);
			emailInput.sendKeys(email);
			telephoneInput.sendKeys(telephone);
			faxInput.sendKeys(fax);
			companyInput.sendKeys(company);
			address1Input.sendKeys(address1);
			address2Input.sendKeys(address2);
			cityNameInput.sendKeys(city);	
			postalCodeInput.sendKeys(postalCode);
			
			loginNameInput.sendKeys(randomFirstName+randomLastName+ randomNumberForTheEmail);
			passwardInput.sendKeys(password);
			passwardReconfirmInput.sendKeys(password);
	
			agreebox.click();
			continuebutton.click();
			
		
			

			
			// hirahaf
			
			
			
		
	}
	
	
}
