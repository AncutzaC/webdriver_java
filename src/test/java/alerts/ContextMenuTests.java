package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class ContextMenuTests extends BaseTests {

    @Test
    public void accessContextMenu (){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.selectSquareAndRightClick();
        assertTrue(contextMenuPage.getAlertMessage().contains("You selected a context menu"), "The alert text is " +
                "not the right one.");
        contextMenuPage.click_AlertAcceptButton();
    }
}
