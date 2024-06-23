package com.kodilla.selenium.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom extends AbstractPom {

    @FindBy(css = "input[type= 'text']")
    WebElement textField;
    @FindBy(css = "input[type= 'text']")
    WebElement webElement;
    
    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean textPom (String text) {
        textField.sendKeys(text);
        return true;
    }
}
