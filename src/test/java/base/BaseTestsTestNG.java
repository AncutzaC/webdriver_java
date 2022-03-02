package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.EventReporter;
import utils.EventReporterNotDeprecated;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.net.http.WebSocket;
import java.nio.file.Files;

public class BaseTestsTestNG {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("driver.chrome.driver", "resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
            if (ITestResult.FAILURE == result.getStatus()) {
                var camera = (TakesScreenshot) driver;
                var screenshot = camera.getScreenshotAs(OutputType.FILE).toPath();
                try {
                    Files.move(screenshot,
                            new File("resources/screenshots/testsFailed/" + result.getName() + ".png").toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

            @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

