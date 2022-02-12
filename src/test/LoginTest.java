package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		
//		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
//		
//		LoginLink.click();
//		
//		WebElement userName = driver.findElement(By.name("user_login"));
//		WebElement passWord = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.name("btn_login"));
//		
//		userName.sendKeys("");
//		passWord.sendKeys("");
//		loginBtn.click();
//		
//		WebElement errormsg = driver.findElement(By.id("msg_box"));
//		
//		String actualmsg =errormsg.getText();
//		String expmsg = "The email or password you have entered is invalid ";
//		

	}

}
