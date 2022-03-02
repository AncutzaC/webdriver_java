package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicallyLoadedPage {
    private WebDriver driver;
    private String linkXpath_Format=".//a[contains(text(), '%s')]";
    private By link_Example1= By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2= By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicallyLoadedPage (WebDriver driver) {
        this.driver=driver;
    }

    public DynamicallyLoadedPageExample1 clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicallyLoadedPageExample1 (driver);
    }

    public DynamicallyLoadedPageExample2 clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicallyLoadedPageExample2(driver);
    }

    public DynamicallyLoadedPage2 clickRightExample2(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(link_Example2)).sendKeys(Keys.ARROW_DOWN).click().perform();
        return new DynamicallyLoadedPage2(driver);
    }

}
