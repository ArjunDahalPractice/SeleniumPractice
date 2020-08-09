package crmTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
//
	WebDriver wd;

	@Test
	public void mainFile() {
		LoginTest obj = new LoginTest();
		obj.launchBrowser();
		obj.login();
		obj.teardown();
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	public void login() {
		wd.get("http://www.techfios.com/ibilling/?ng=admin/");
		wd.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		wd.findElement(By.xpath("//button[@name='login']")).click();
	}

	public void teardown() {
		wd.close();
	}

}
