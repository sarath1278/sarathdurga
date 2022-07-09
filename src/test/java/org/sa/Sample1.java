package org.sa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("9677070231");

		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("12345678");

		WebElement element3 = driver.findElement(By.name("login"));
		element3.click();

	}
}