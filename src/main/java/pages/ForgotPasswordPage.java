package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By passwordField = By.cssSelector("#email");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver=driver;
    }

    public void setEmailForForgotPassword (String emailForForgotPassword){
        driver.findElement(passwordField).sendKeys(emailForForgotPassword);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(By.id("form_submit")).click();
        return new EmailSentPage(driver);
    }

}
