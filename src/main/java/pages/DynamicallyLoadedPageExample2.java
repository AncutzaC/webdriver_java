package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicallyLoadedPageExample2 {
    private WebDriver driver;
    private By messagePresent= By.id("finish");
    private By startButton = By.cssSelector("#start button");

    public DynamicallyLoadedPageExample2(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(startButton));
        driver.findElement(startButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(messagePresent));
    }

    public String getLoadedText (){
        return driver.findElement(messagePresent).getText();
    }
}
