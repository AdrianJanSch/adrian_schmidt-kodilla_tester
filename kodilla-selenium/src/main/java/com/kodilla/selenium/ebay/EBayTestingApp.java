package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver5.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement inputField = driver.findElement(By.name("_nkw")); // [4]
        inputField.sendKeys("laptop");
        inputField.submit();

    }
}
