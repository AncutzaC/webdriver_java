package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By areaSelected = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver=driver;
    }

    public void selectSquareAndRightClick(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(areaSelected)).contextClick().perform();
    }

    public String getAlertMessage(){
        var alertMessage = driver.switchTo().alert().getText();
    return alertMessage;}

    public void click_AlertAcceptButton(){
        driver.switchTo().alert().accept();
    }
}