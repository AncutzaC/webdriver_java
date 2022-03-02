package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicallyLoadedPage2 {

    private WebDriver driver;
    private By startButton = By.id("start");

    public DynamicallyLoadedPage2(WebDriver driver){
        this.driver=driver;
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    public void switchWindows (){
        var window = driver.getWindowHandle();
        driver.switchTo().window(window);
    }
}
