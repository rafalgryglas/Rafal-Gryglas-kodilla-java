package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    private static final String XPATH_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    private static final String XPATH_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        //date 19-12-1988
        WebElement dayField = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByIndex(19);

        WebElement monthFiled = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(monthFiled);
        selectMonth.selectByValue("12");

        WebElement yearField = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByValue("1988");

    }
}
