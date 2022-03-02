package cookies;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Cookie;

import static org.junit.jupiter.api.Assertions.assertFalse;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class CookiesTests extends BaseTests {

    @Test
    public void testDeleteCookie(){
        var cookieManager = homePage.manageCookies();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");

    }
}
