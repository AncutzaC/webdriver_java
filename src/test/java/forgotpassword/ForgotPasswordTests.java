package forgotpassword;

import base.BaseTestsTestNG;
import org.junit.jupiter.api.TestInstance;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class ForgotPasswordTests extends BaseTestsTestNG {

    @Test
    public void sendForgotPassword (){
        //click pe pagina de ForgotPassword;
        var forgotPasswordPage =homePage.clickForgotPasswordPage();
        //introduce email-ul
        forgotPasswordPage.setEmailForForgotPassword("tau@example.com");
        //click pe retrieve button
        var emailSentPage= forgotPasswordPage.clickRetrievePasswordButton();
        //verificam daca mesajul afisat este corespunzator
        assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"),"Alert text is incorrect!");
    }

}
