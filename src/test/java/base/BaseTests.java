package base;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.HomePage;
import utils.EventReporterNotDeprecated;
import utils.WindowManager;

public class BaseTests {
    //public EventFiringWebDriver webdriver;
    public EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporterNotDeprecated());


        driver.get("http://the-internet.herokuapp.com/");
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePage = new HomePage(driver);

        setCookie();
    }


    //@AfterEach
    //public void tearDown(){
    // driver.quit();
    //}

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("disable-infobars");// fara mentiunea ca este controlat de noi
        //options.setHeadless(true);//nu este vizibila fereastra de test
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}

