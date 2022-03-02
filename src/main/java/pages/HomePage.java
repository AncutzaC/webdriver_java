package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CookieManager;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownPage() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordPage() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public NestedFramesPage clickNestedFrames() {
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    public DynamicallyLoadedPage clickDynamicallyLoaded() {
        clickLink("Dynamic Loading");
        return new DynamicallyLoadedPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultiplePages clickMultiplePages() {
        clickLink("Multiple Windows");
        return new MultiplePages(driver);
    }

    public CookieManager manageCookies(){
        return new CookieManager(driver);
    }
}
