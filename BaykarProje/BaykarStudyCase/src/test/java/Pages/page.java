package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class page {
    WebDriver driver;

    public page (WebDriver driver){
        this.driver = driver;
    }

    public void isOnRight(By locater, String expected) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3L));
        String data = wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).getText();
        Assert.assertEquals(data, expected);
    }

    public void waitUntil(String locater) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locater)));
    }

    public void clickButton (String locater) {
        driver.findElement(By.xpath(locater)).click();
    }

    public void dataSendKeys (By locater, String data){
        driver.findElement(locater).sendKeys(data);
    }
}
