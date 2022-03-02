/*package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class HomeWork {
    private WebDriver driver;
    public void SettingTheHomework (){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement inputLink1=driver.findElement(By.linkText("Shifting Content"));
        inputLink1.click();
        WebElement inputLink2=driver.findElement(By.linkText("Example 1: Menu Element"));
        inputLink2.click();
        List<WebElement> links=driver.findElements(By.cssSelector("ul>li"));
        System.out.println(links.size());
        //driver.quit();
    }
    public static void main (String args[]){
        HomeWork test = new HomeWork();
        test.SettingTheHomework();
    }
}
*/