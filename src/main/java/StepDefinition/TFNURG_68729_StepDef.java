package StepDefinition;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TFNURG_68729_StepDef {
	WebDriver driver;
	
	@Given("^user logged in with BCA customer$")
	public void user_logged_in_with_BCA_customer() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paku0817\\Desktop\\AT\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://devapp274cn:6880/platform/csr/customer.jsp?tab=_Customer+Products&object=9147310118913377872");
		driver.findElement(By.id("user")).sendKeys("sysadm");
		driver.findElement(By.id("pass")).sendKeys("netcracker");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button")).click();
		
	}

	@When("^customer should have existing prepaid offer and BA$")
	public void customer_should_have_existing_prepaid_offer_and_BA() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@href,'/platform/csr/customer.jsp?tab=_Billing+Accounts+++')]")).click();
		Thread.sleep(5000);
		
	}

	@Then("^user navigate to BA page$")
	public void user_navigate_to_BA_page() throws InterruptedException {
		//driver.findElement(By.xpath("//a[@href='/ncobject.jsp?id=9147310087513181609']")).click();
		Thread.sleep(15000);
		System.out.println("888888888888888888888888888888888888888");
		String text=driver.findElement(By.xpath("(//button[@class='TableCtrl-button TableCtrl-button-icon NewNote'])[3]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[text()='New Prepaid Billing Account']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement createbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Create']")));
		boolean status = createbutton.isDisplayed();
		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
			driver.findElement(By.xpath("//button[text()='Create']")).click();
		} 
	}
		

	@Then("^user click on payment tab$")
	public void user_click_on_payment_tab() {
		
		
	}

	@Then("^user click on new payment button$")
	public void user_click_on_new_payment_button() {
		
	}

	@Then("^user enters the amount and click on create button$")
	public void user_enters_the_amount_and_click_on_create_button() {
	
	}

	@Then("^payment should be created$")
	public void payment_should_be_created() {
		
	}



}
