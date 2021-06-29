package Selenium_Cucumber_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenURLBrowser {
	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.out.println("Example.1 Open the above URL in Chrome browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Selenium\\SDET_Automation_Batch3\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		System.out.println("Opened Browser");
		driver.manage().window().maximize();
		System.out.println("Application URL:   " + driver.getCurrentUrl());

		System.out.println("Example.2- Print the title of this application");

		System.out.println("Application title name:  " + driver.getTitle());
		// xpath Locator
		System.out.println("Example.3 Write Xpath and CssSelector of login page ");

		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.xpath("//input[@name='txtPassword']"));
		driver.findElement(By.xpath("//input[@type='submit']"));
		System.out
				.println("forgot Password Link " + driver.findElement(By.linkText("Forgot your password?")).getText());
		System.out.println("Application Logo" + driver.findElement(By.xpath("//div[@id='divLogo']//child::img")));
		// CSS locator

		driver.findElement(By.cssSelector("input#txtUsername"));
		driver.findElement(By.cssSelector("input#txtPassword"));
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.xpath("//div[@id='divLogo']//child::img"));

		System.out.println("Example.4 Login with given User Name and Password");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement acutalVal = driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]"));
		String exptvalue = "Dashboard";
		Assert.assertEquals(acutalVal, exptvalue, "true");

	}

}
