package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
//    public static final String SEARCHFIELD = "lst-ib";
    public static final String SEARCHFIELD = "sb_form_q";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.bing.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();

    }
}
