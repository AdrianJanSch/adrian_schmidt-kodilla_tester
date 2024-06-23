package com.kodilla.selenium.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaStoreApp {
    private static WebDriver driver;
    private static ChromeOptions chromeOptions;
    private static KodillaStorePom storePom;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver5.exe");
        String url = "https://kodilla.com/pl/test/store";

        driver = getDriver(url);
        storePom = new KodillaStorePom(driver);
        storePom.textPom("NoteBook");
        driver.close();

        driver = getDriver(url);
        storePom = new KodillaStorePom(driver);
        storePom.textPom("School");
        driver.close();

        driver = getDriver(url);
        storePom = new KodillaStorePom(driver);
        storePom.textPom("Brand");
        driver.close();

        driver = getDriver(url);
        storePom = new KodillaStorePom(driver);
        storePom.textPom("Business");
        driver.close();

        driver = getDriver(url);
        storePom = new KodillaStorePom(driver);
        storePom.textPom("Gaming");
        driver.close();

        driver = getDriver(url);
        storePom = new KodillaStorePom(driver);
        storePom.textPom("Powerful");
        driver.close();

    }

    private static WebDriver getDriver(String url){
        chromeOptions = new ChromeOptions();
        WebDriver drv = new ChromeDriver(chromeOptions);
        drv.navigate().to(url);
        return drv;
    }
}
