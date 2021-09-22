package com.ornek.denemeSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DenemeSeleniumApplicationTests {
	
	private WebDriver driver;
	String emailim="duygubaran1995@gmail.com";
	String şifre ="dbcbsbsb13121995";

	@Test
	void contextLoads() {
		
		System.setProperty("webdriver.chrome.driver", utils.serv); //driver'ın yerini belirlemek
		
		driver = new ChromeDriver(); //driver nesnesi oluşturuldu
		driver.get(utils.webPage); //web sitesine gitmek
		
		WebElement loginButton = driver.findElement(new By.ByCssSelector("#hamburger-menu > li:nth-child(3) > a")); //web element objesi oluşturmak
		loginButton.click();
		
		WebElement emailButton = driver.findElement(By.id("email"));
		emailButton.click();
		emailButton.sendKeys(emailim);
		
		WebElement passwordButton = driver.findElement(By.id("password"));
		passwordButton.click();
		passwordButton.sendKeys(şifre);
		
		WebElement logButton = driver.findElement(By.name("commit"));
		logButton.click();
		
		driver.get(utils.newPage); //web sitesine gitmek
		
		
		
	}

}
