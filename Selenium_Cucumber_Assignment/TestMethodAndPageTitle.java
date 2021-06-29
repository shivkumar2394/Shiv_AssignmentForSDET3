package Selenium_Cucumber_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMethodAndPageTitle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		try {
			String Name = "Admin";
			String Psword = "admin123";
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		driver.findElement(By.linkText("Admin"));
		Thread.sleep(4000);
		String reqtxt = Admin();
		System.out.println(reqtxt);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(4000);
		String sPIM = PIM();
		System.out.println(sPIM);
		driver.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(4000);
		String Dboard = LeaveDashBoard();
		System.out.println(Dboard);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		Thread.sleep(4000);
		String Dir = Directory();
		System.out.println(Dir);
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		Thread.sleep(4000);
		String Maintai = Maintanence();
		System.out.println(Maintai);
	}

	public static String Admin() {
		String ReqText = driver.findElement(By.id("menu_admin_UserManagement")).getText();
		return ReqText;
	}

	public static String PIM() {
		String ReqText = driver.findElement(By.id("menu_pim_viewEmployeeList")).getText();
		return ReqText;
	}

	public static String LeaveDashBoard() {
		String ReqText = driver.findElement(By.id("menu_dashboard_index")).getText();
		return ReqText;
	}

	public static String Directory() {
		String ReqText = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
		return ReqText;
	}

	public static String Maintanence() {
		String ReqText = driver.findElement(By.id("menu_maintenance_purgeEmployee")).getText();
		return ReqText;
	}

}
