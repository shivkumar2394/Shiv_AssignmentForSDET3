package Selenium_Cucumber_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminHomePageValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("Example.1 Open the above URL in Chrome browser");
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();
		System.out.println("Verify the UserManagement"
				+ driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).getText());
		System.out.println("verify the Job" + driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).getText());
		System.out.println("verify the Organization"
				+ driver.findElement(By.xpath("//a[@id='menu_admin_Organization']")).getText());
		System.out.println("verify the Qualifications"
				+ driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).getText());

	}

}
