package wait;

import base.BaseTests;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class WaitTests extends BaseTests {

    @Test
    @Disabled
    public void testWaitUntilHidden(){
        var loadingPage= homePage.clickDynamicallyLoaded().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect.");
    }

    @Test
    public void testHomeworkWait(){
        var loadingPage = homePage.clickDynamicallyLoaded().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect.");
    }
}
