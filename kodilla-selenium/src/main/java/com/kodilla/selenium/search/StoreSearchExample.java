package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver5.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/store");
        WebElement inputField = driver.findElement(By.name("search")); // [4]
        inputField.sendKeys("School");
        inputField.submit();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my_Class")));
    }
}