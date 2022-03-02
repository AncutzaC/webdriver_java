package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.LoginPage;
import pages.SecureAreaPage;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage= homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
        Assertions.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                    "Alert text is incorrect.");
    }
    }


