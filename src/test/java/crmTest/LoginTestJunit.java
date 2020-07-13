package crmTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	WebDriver wd;
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		wd = new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waiting maximum 10 seconds to wait for elements...
		wd.manage().window().maximize();
	}

	@Test
	public void login() throws InterruptedException {
		wd.get("http://www.techfios.com/ibilling/?ng=admin/");
		wd.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		wd.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void login1() throws InterruptedException {
		wd.get("http://www.techfios.com/ibilling/?ng=admin/");
		wd.findElement(By.xpath("//input[@id='username1']")).sendKeys("demo@techfios.com");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		wd.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void login2() throws InterruptedException {
		wd.get("http://www.techfios.com/ibilling/?ng=admin/");
		wd.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		wd.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}
	
	@After
	public void teardown() {
		wd.close();
	}
}
