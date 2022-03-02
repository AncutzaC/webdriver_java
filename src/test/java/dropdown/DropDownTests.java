package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption (){
        var dropDownPage = homePage.clickDropdownPage();
        String option ="Option 1";

        dropDownPage.selectFromDropdown(option);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections.");
        assertTrue(selectedOptions.contains(option),"Option not selected.");
    }
}
