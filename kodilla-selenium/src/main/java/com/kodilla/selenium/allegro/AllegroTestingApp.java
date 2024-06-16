package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver5.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("mavic mini");
        WebDriverWait wait = new WebDriverWait(driver, 5);

        inputField = driver.findElement(By.className("gh-sb"));
        Select wrapperSelect = new Select(inputField);
        wrapperSelect.selectByValue("1249");
        inputField.submit();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("item5e3984a53b")));

        List<WebElement> elements = driver.findElements(By.className("clipped"));
        for (int i = 1; i < elements.size(); i++){
            System.out.println(elements.get(i).getText());
        }



    }
}
