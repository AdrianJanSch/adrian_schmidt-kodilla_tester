package com.kodilla.selenium.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStoreAppTest {

   KodillaStorePom storePom;
   WebDriver driver;
    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver5.exe");
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }
    @AfterEach
    public void end(){
        driver.close();
    }
    @ParameterizedTest
    @CsvSource(value = {"NoteBook,2", "School,1", "Brand,1", "Business,0", "Gaming,1", "Powerful,0"})
    public void ShouldReturnTrueCountResults(String input, int expected){
        boolean search = storePom.textPom(input);
        List<WebElement> elements = driver.findElements(By.className("header"));
        assertEquals(expected,elements.size());
    }

    @ParameterizedTest
    @CsvSource(value = {"notebook,NoteBook", "NoTeBooK,NoteBook", "NOTEBOOK,NoteBook", "noteBOOK,NoteBook", "NoTEb,NoteBook"})
    public void shouldReturnTrueForVariousSearchAndIgnoreSensitiveCase(String input, String expected) {
        boolean search = storePom.textPom(input);
        List<WebElement> elements = driver.findElements(By.className("header"));
        elements.forEach(el->{
            var tt = el.getText();
            assertTrue(tt.contains(expected));
        });

    }


}
