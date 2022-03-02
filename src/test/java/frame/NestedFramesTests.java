package frame;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class NestedFramesTests extends BaseTests {

        @Test
        public void testFrameText() {
            var nestedFramesPage = homePage.clickNestedFrames();
            assertTrue(nestedFramesPage.getLeftFrameText().contains("LEFT"), "Left frame text incorrect");
            assertTrue(nestedFramesPage.getBottomFrameText().contains("BOTTOM"), "Bottom frame text incorrect");
        }
}
