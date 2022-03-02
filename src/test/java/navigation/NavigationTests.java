package navigation;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import pages.DynamicallyLoadedPage;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicallyLoaded().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("http://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultiplePages().clickHere();
        getWindowManager().switchTab("New Window");
    }

    @Test
    public void testDynamicLoadingLinkHomework (){
        var newPage= homePage.clickDynamicallyLoaded().clickRightExample2();
        newPage.switchWindows();
        assertTrue(newPage.isStartButtonDisplayed(),"The start button is not " +
               "displayed.");
    }

}
