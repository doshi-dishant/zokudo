package com.zokudo.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rittenhouse-ui-admin-dev.vercel.app/");
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.id("email")).sendKeys("jshah@arke.com");
		driver.findElement(By.id("password")).sendKeys("Arkesystems@123");
		driver.findElement(By.id("next")).click();
	}
}
