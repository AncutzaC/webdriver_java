package javascript;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void selectBothOptionsInDropdown(){
        var dropDownPage = homePage.clickDropdownPage();
        dropDownPage.setAttributeInDropDownOption();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropdown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), optionsToSelect.size(),"Incorrect number of selections.");
        assertTrue(selectedOptions.containsAll(optionsToSelect),"All options were not selected.");
    }
}
